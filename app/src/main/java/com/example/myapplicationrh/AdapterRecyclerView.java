package com.example.myapplicationrh;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterRecyclerView extends RecyclerView.Adapter<AdapterRecyclerView.ViewHolder> {
    ArrayList<ItemModel> dataItem;
    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView textJudul;
        TextView textTahun;
        ImageView textFilm;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textJudul=itemView.findViewById(R.id.judul);
            textTahun=itemView.findViewById(R.id.tahun);
            textFilm=itemView.findViewById(R.id.image1);

        }
    }
    AdapterRecyclerView(ArrayList<ItemModel>data){
        this.dataItem=data;
    }
    @NonNull
    @Override
    public AdapterRecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.grid_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterRecyclerView.ViewHolder holder, int position) {
        TextView judul= holder.textJudul;
        TextView tahun= holder.textTahun;
        ImageView image1= holder.textFilm;

        judul.setText(dataItem.get(position).getName());
        tahun.setText(dataItem.get(position).getYear());
        image1.setImageResource(dataItem.get(position).getPoster());
    }

    @Override
    public int getItemCount() {
        return dataItem.size();
    }


}
