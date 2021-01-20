package com.example.postventadroid.Adapter;

import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.postventadroid.Model.Item;
import com.example.postventadroid.databinding.ItemLayoutBinding;

import java.net.BindException;
import java.util.ArrayList;
import java.util.List;

//Extender desde la clase interna generada ApartamentViewHolder ,

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ApartamentViewHolder> {
    public ItemAdapter(Object apartment) {
    }
    //representación de lo datos tipo items
    private List<Item>itemList;

    //generar constructor posterior para instanciar el adaptador , ultimo paso
    public ItemAdapter(List<Item> itemList) {
        this.itemList = itemList;
    }

    @NonNull
    @Override
    public ApartamentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //instanciar biding inflar vista de recycler view , se da contexto con el viewGroup parent
       ItemLayoutBinding binding = ItemLayoutBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new ApartamentViewHolder(binding);
    }


    //une las vistas por su posición ,objeto u item view holder de mi clase autogenerada ApartamentViewHolder, se encuentra por posición
    public void onBindViewHolder(@NonNull ApartamentViewHolder holder, int position) {

        //crear la variable itemlistHolder donde quedara guardado el objeto según su posición del itemList
     Item itemListHolder = itemList.get(position);

     //llamar el getters de la clase creada item mediante metodo getitemdescription
     holder.textView.setText(itemListHolder.getItemDescription());
     //mostrar imagen de internet ,holder es el obejto donde se encuentra la imagen
        Glide.with(holder.imageView.getContext()).load(itemListHolder.getUrlImage()).into(holder.imageView);

    }


    @Override


    public int getItemCount() {
        return itemList.size();
    }

    //clase interna  generada  puede ser una clase tipo cantante,perro gato ,
    //con atributos en xml XXX ViewHolder , contenedor de las vistas
    public class ApartamentViewHolder extends RecyclerView.ViewHolder{
    private ImageView imageView;
    private TextView textView;

    //modificar el View por el metodo Binding en este caso "ItemLayoutBinding"
    //nombre variable modificado y en la super devolverle una vista con metodo binding
        public ApartamentViewHolder(@NonNull ItemLayoutBinding itemBinding) {
            super(itemBinding.getRoot());
            textView = itemBinding.tvItem;
            imageView= itemBinding.ivItem;

        }
    }



}
