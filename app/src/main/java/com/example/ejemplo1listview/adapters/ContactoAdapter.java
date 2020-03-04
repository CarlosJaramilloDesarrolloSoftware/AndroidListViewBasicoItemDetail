package com.example.ejemplo1listview.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.ejemplo1listview.R;
import com.example.ejemplo1listview.models.ContactoModel;

import java.util.ArrayList;

public class ContactoAdapter extends BaseAdapter {

    private ArrayList<ContactoModel> contactoModelArrayList;
    private Context context;
    private ContactoModel model;

    public ContactoAdapter(ArrayList<ContactoModel> contactoModelArrayList, Context context) {
        this.contactoModelArrayList = contactoModelArrayList;
        this.context = context;
    }

    @Override
    public int getCount() {
        return contactoModelArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return contactoModelArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View itemView = convertView;
        if (convertView == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            itemView = inflater.inflate(R.layout.item_main_lista, parent, false);
        }

        TextView tv_nombre, tv_estado;
        tv_nombre = itemView.findViewById(R.id.tv_item_main_lista_nombre);
        tv_estado = itemView.findViewById(R.id.tv_item_main_lista_estado);

        model = contactoModelArrayList.get(position);

        String nombreMostrar = model.get_nombre() + " - " + model.get_numero();
        String estadoMostrar = "Estado: " + model.get_estado();

        tv_nombre.setText(nombreMostrar);
        tv_estado.setText(estadoMostrar);

        return itemView;
    }
}
