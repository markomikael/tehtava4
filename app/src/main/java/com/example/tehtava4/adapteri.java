package com.example.tehtava4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import org.json.JSONArray;

import java.util.ArrayList;
import java.util.List;

public class adapteri extends ArrayAdapter<luokka> {

    private  Context context;
    ArrayList <luokka> dataset;
    private Button poista;
    luokka luokka;

    public adapteri(@NonNull Context context, int resource, @NonNull List<luokka> objects) {
        super(context, resource, objects);

        this.context = context;
        this.dataset = (ArrayList<luokka>)objects;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {


        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View v = layoutInflater.inflate(R.layout.adapteri,parent,false);
        LinearLayout linearLayout = (LinearLayout) v;

        TextView lista = v.findViewById(R.id.textView);
        TextView lista2 = v.findViewById(R.id.textView2);

        lista.setText(dataset.get(position).getTitle());
        lista2.setText(dataset.get(position).getBody());

        return v;
    }
}

