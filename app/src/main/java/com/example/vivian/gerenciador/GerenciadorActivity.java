package com.example.vivian.gerenciador;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.vivian.gerenciador.adaptadores.MenuGerenciadorAdapter;

public class GerenciadorActivity extends AppCompatActivity {

    private String[] lDesc = {"Pagamentos", "Cadastros", "Relatórios"};
    private int [] lImgs = {R.drawable.layout_ic_pagamentos, R.drawable.layout_ic_cadastros, R.drawable.layout_ic_relatorio};
    private ListView lvMenu;
    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gerenciador);

        lvMenu = (ListView) findViewById(R.id.lvMenu);
        MenuGerenciadorAdapter mga = new MenuGerenciadorAdapter(this, lDesc, lImgs);

        lvMenu.setAdapter(mga);

        lvMenu.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        i = new Intent(getApplicationContext(), MesasActivity.class);
                        startActivity(i);
                        break;
                    case 1:
                     //   i = new Intent(getApplicationContext(), CadastrosActivity.class);
                        startActivity(i);
                        break;
                    case 2:
                     //   i = new Intent(getApplicationContext(), RelatoriosActivity.class);
                        startActivity(i);
                        break;
                    default:
                        break;
                }
            }
        });

    }
}
