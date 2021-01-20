package com.example.postventadroid;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.postventadroid.Adapter.Item;

import java.util.ArrayList;
import java.util.List;

public class FirstFragment extends Fragment {

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.button_first).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(FirstFragment.this)
                        .navigate(R.id.action_FirstFragment_to_SecondFragment);
            }
        });
    }

    //generar listado  de items
    public static List<Item> apartmentList() {
        List<Item> apartmentList = new ArrayList<>();
        Item apartment01 = new Item("Edificio Almendro", "Torre 1", "depto 2002", "san jose 345, La florida , Santiago", "https://unsplash.com/photos/Ub9LkIWxyec/download?force=true&w=640");
        Item apartment02 = new Item("Edificio Almendro", "Torre 1", "depto 2003", "san jose 345, La florida, Santiago", "https://unsplash.com/photos/Ub9LkIWxyec/download?force=true&w=640");
        Item apartment03 = new Item("Edificio Almendro", "Torre 1", "depto 1601", "san jose 345, La florida, Santiago", "https://unsplash.com/photos/Ub9LkIWxyec/download?force=true&w=640");
        Item apartment04 = new Item("Edificio Alerces", "Torre b", "depto 1602", "nueva providencia 1801, Providencia", "https://unsplash.com/photos/PhYq704ffdA/download?force=true&w=640");
        Item apartment05 = new Item("Edificio Alerces", "Torre b", "depto 1801", "nueva providencia 1801, Providencia", "https://unsplash.com/photos/PhYq704ffdA/download?force=true&w=640");
        Item apartment06 = new Item("Edificio Legado 2", "Torre a", "depto 801", "Alcalde pedro alarcon 925, San Miguel", "https://unsplash.com/photos/jU9VAZDGMzs/download?force=true&w=640");
        Item apartment07 = new Item("Edificio Legado 2", "Torre a", "depto 902", "Alcalde pedro alarcon 925, San Miguel", "https://unsplash.com/photos/jU9VAZDGMzs/download?force=true&w=640");
        Item apartment08 = new Item("Edificio Legado 2", "Torre a", "depto 909", "Alcalde pedro alarcon 925, San Miguel", "https://unsplash.com/photos/jU9VAZDGMzs/download?force=true&w=640");
        Item apartment09 = new Item("Edificio Legado 2", "Torre a", "depto 1901", "Alcalde pedro alarcon 925, San Miguel", "https://unsplash.com/photos/jU9VAZDGMzs/download?force=true&w=640");
        Item apartment10 = new Item("Condominio nuevo mirador", "Torre 1", "depto 102", "Costanera norte 245, Vitacura", "https://unsplash.com/photos/pPxhM0CRzl4/download?force=true&w=640");
        Item apartment11 = new Item("Condominio nuevo mirador", "Torre 1", "depto 103", "Costanera norte 245, Vitacura", "https://unsplash.com/photos/pPxhM0CRzl4/download?force=true&w=640");
        Item apartment12 = new Item("Condominio nuevo mirador", "Torre 1", "depto 1501", "Costanera norte 245, Vitacura", "https://unsplash.com/photos/pPxhM0CRzl4/download?force=true&w=640");
        Item apartment13 = new Item("Condominio nuevo mirador", "Torre 1", "depto 1503", "Costanera norte 245, Vitacura", "https://unsplash.com/photos/pPxhM0CRzl4/download?force=true&w=640");
        Item apartment14 = new Item("Condominio nuevo mirador", "Torre 2", "depto 2001", "Costanera norte 245, Vitacura", "https://unsplash.com/photos/pPxhM0CRzl4/download?force=true&w=640");
        Item apartment15 = new Item("Condominio nuevo mirador", "Torre 2", "depto 2201", "Costanera norte 245, Vitacura", "https://unsplash.com/photos/pPxhM0CRzl4/download?force=true&w=640");
        apartmentList.add(apartment01);
        apartmentList.add(apartment02);
        apartmentList.add(apartment03);
        apartmentList.add(apartment04);
        apartmentList.add(apartment05);
        apartmentList.add(apartment06);
        apartmentList.add(apartment07);
        apartmentList.add(apartment08);
        apartmentList.add(apartment09);
        apartmentList.add(apartment10);
        apartmentList.add(apartment11);
        apartmentList.add(apartment12);
        apartmentList.add(apartment13);
        apartmentList.add(apartment14);
        apartmentList.add(apartment15);
        return apartmentList;
    }
}