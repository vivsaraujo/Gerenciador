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
    private List<Mesa> lista;
    private ListView lvMesas;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        lista = getLista();
        lvMesas = (ListView) container.findViewById(R.id.lvMesas);
        adapter = new MesaAdapter(getActivity(), lista);
        lvMesas.setAdapter(adapter);

        return inflater.inflate(R.layout.tab_mesa, container, false);

    }

    public List<Mesa> getLista() {

        lista = new ArrayList<>();

        lista.add(new Mesa("001"));
        lista.add(new Mesa("002"));
        lista.add(new Mesa("003"));
        lista.add(new Mesa("004"));
        lista.add(new Mesa("005"));
        lista.add(new Mesa("006"));
        lista.add(new Mesa("007"));
        lista.add(new Mesa("008"));
        lista.add(new Mesa("009"));
        lista.add(new Mesa("010"));

        return lista;
    }
}

