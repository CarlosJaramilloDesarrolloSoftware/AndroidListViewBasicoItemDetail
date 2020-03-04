package com.example.ejemplo1listview;

import android.os.Bundle;

import com.example.ejemplo1listview.models.ContactoModel;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.TextView;

public class DetalleActivity extends AppCompatActivity {

    TextView tv_detalle_informacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        tv_detalle_informacion = findViewById(R.id.tv_detalle_informacion);

        ContactoModel response = (ContactoModel) getIntent().getSerializableExtra("item");

        String nombreMostrar = response.get_nombre() + " - " + response.get_numero();
        String estadoMostrar = "Estado: " + response.get_estado();

        tv_detalle_informacion.setText("Detalle: \n\n" + nombreMostrar + "\n" +estadoMostrar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}
