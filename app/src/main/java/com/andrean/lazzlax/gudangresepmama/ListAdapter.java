package com.andrean.lazzlax.gudangresepmama;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

/**
 * Created by LazzLax on 10/12/2017.
 */

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.listHolder> {

    Context context;
    List<DesignItem> resep;

    public ListAdapter(Context context, List<DesignItem> resep) {
        this.context = context;
        this.resep = resep;
    }

    @Override
    public listHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View a = LayoutInflater.from(parent.getContext()).inflate(R.layout.chart_item,null);
        return new listHolder(a);
    }

    @Override
    public void onBindViewHolder(listHolder holder, final int position) {

        Glide.with(context)
                .load(resep.get(position).getImg())
                .into(holder.tampilGambar);

        holder.tampilJudul.setText(resep.get(position).getJudul());
        holder.tampilDesc.setText(resep.get(position).getDesc());

        holder.cardItemChart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View vw) {
                Intent a = new Intent(vw.getContext(), DetailResep.class);
                a.putExtra("id_judul", resep.get(position).getJudul());
                a.putExtra("id_desc", resep.get(position).getDesc());
                a.putExtra("id_gambar", resep.get(position).getImg());
                vw.getContext().startActivity(a);
            }
        });
    }

    @Override
    public int getItemCount() {
        return resep.size();
    }

    class listHolder extends RecyclerView.ViewHolder{

        CardView cardItemChart;
        ImageView tampilGambar;
        TextView tampilJudul, tampilDesc;

        public listHolder(View itemView) {
            super(itemView);
            cardItemChart = (CardView) itemView.findViewById(R.id.carditem_chart);
            tampilGambar = (ImageView) itemView.findViewById(R.id.gambar);
            tampilJudul = (TextView) itemView.findViewById(R.id.txt_judul);
            tampilDesc = (TextView) itemView.findViewById(R.id.txt_desc);
        }
    }

}
