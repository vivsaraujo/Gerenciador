package com.example.vivian.gerenciador.adaptadores;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.vivian.gerenciador.R;
import com.example.vivian.gerenciador.classes.BasePedido;

import java.util.List;


public class MeusPedidosAdapter extends BaseAdapter {

    private Context pContexto;
    private List<BasePedido> pBasePedido;

    public MeusPedidosAdapter(Context pContexto, List<BasePedido> pBasePedido) {
        this.pContexto = pContexto;
        this.pBasePedido = pBasePedido;
    }

    @Override
    public int getCount() {
        return pBasePedido.size();
    }

    @Override
    public Object getItem(int position) {
        return pBasePedido.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = View.inflate(pContexto, R.layout.row_comandas, null);
        TextView txtPrato = (TextView)v.findViewById(R.id.txtPrato);
        TextView txtComanda = (TextView)v.findViewById(R.id.txtComanda);
        TextView txtMesa = (TextView)v.findViewById(R.id.txtMesa);
        TextView txtStatus = (TextView)v.findViewById(R.id.txtStatus);

        //setando os txts
        txtPrato.setText(pBasePedido.get(position).getsPrato());
        txtComanda.setText(pBasePedido.get(position).getsComanda());
        txtMesa.setText(pBasePedido.get(position).getsMesa());
        txtStatus.setText(pBasePedido.get(position).getsStatus());

        v.setTag(pBasePedido.get(position).getiId());

        return v;
    }
}
