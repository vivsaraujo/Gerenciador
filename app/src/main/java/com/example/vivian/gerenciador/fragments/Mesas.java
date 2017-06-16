package com.example.vivian.gerenciador.fragments;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ListView;

import com.example.vivian.gerenciador.R;
import com.example.vivian.gerenciador.adaptadores.MesaAdapter;
import com.example.vivian.gerenciador.classes.Mesa;

import java.util.ArrayList;
import java.util.List;

public class Mesas extends Fragment {

    private MesaAdapter adapter;
    private List<Mesa> lista = new ArrayList<>();
    private ListView lvMesas;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        lvMesas = (ListView) container.findViewById(R.id.lvMesas);

        lista.add(new Mesa("001", 1, 0));
        lista.add(new Mesa("002", 2, 0));
        lista.add(new Mesa("003", 3, 1));
        lista.add(new Mesa("004", 4, 4));
        lista.add(new Mesa("005", 5, 4));
        lista.add(new Mesa("006", 6, 2));
        lista.add(new Mesa("007", 7, 0));
        lista.add(new Mesa("008", 8, 0));
        lista.add(new Mesa("009", 9, 0));
        lista.add(new Mesa("010", 10, 4));

        adapter = new MesaAdapter(getActivity(), lista);
        lvMesas.setAdapter(adapter);


        return inflater.inflate(R.layout.tab_mesa, container, false);

    }
}
