package com.example.postventadroid.Adapter;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

//Extender desde la clase interna generada ApartamentViewHolder ,

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ApartamentViewHolder> {
    @NonNull
    @Override
    public ApartamentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ApartamentViewHolder holder, int position) {

    }


    @Override

    @NonNull
    public int getItemCount() {
        return 0;
    }

    //clase interna  generada  puede ser una clase tipo cantante,perro gato ,
    //con atributos en xml XXX ViewHolder , contenedor de las vistas
    public class ApartamentViewHolder extends RecyclerView.ViewHolder{

        public ApartamentViewHolder(@NonNull View itemView) {
            super(itemView);


        }
    }
}
