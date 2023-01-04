package com.example.myapplicationrh;


import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterRecyclerView extends RecyclerView.Adapter<AdapterRecyclerView.ViewHolder> {
    ArrayList<ItemModel> dataItem;

    private Context context;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView textJudul;
        TextView textTahun;
        ImageView textFilm;
        LinearLayout parenLayout;



        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textJudul=itemView.findViewById(R.id.judul);
            textTahun=itemView.findViewById(R.id.tahun);
            textFilm=itemView.findViewById(R.id.image1);
            parenLayout=itemView.findViewById(R.id.parentlayout);


        }
    }
    AdapterRecyclerView(Context context,ArrayList<ItemModel>data){
        this.context= context;
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

        holder.parenLayout.setOnClickListener(v->{
            Toast.makeText(context,"Anda memilih "+dataItem.get(position).getName(),Toast.LENGTH_SHORT).show();

            if(dataItem.get(position).getName().equals("IVANNA")){
             Intent intent = new Intent(context,Order.class);
                intent.putExtra("gambar",R.drawable.b2);
                intent.putExtra("teks","IVanna");
             context.startActivity(intent);
            }if(dataItem.get(position).getName().equals("The Doll 3")){
                Intent intent = new Intent(context,Order.class);
                intent.putExtra("gambar",R.drawable.b3);
                intent.putExtra("teks","The Doll 3");
                context.startActivity(intent);
            }
            if(dataItem.get(position).getName().equals("Ghost Writter 2")){
                Intent intent = new Intent(context,Order.class);
                intent.putExtra("gambar",R.drawable.b4);
                intent.putExtra("teks","Ghost Writter");
                context.startActivity(intent);
            }
            if(dataItem.get(position).getName().equals("Mata Batin")){
                Intent intent = new Intent(context,Order.class);
                intent.putExtra("gambar",R.drawable.b5);
                intent.putExtra("teks","Mata Batin");
                context.startActivity(intent);
            }
            if(dataItem.get(position).getName().equals("Pengabdi Asep")){
                Intent intent = new Intent(context,Order.class);
                intent.putExtra("gambar",R.drawable.b6);
                intent.putExtra("teks","Pengabdi Asep");
                context.startActivity(intent);
            }
            if(dataItem.get(position).getName().equals("Hantu tanah Jahanam")){
                Intent intent = new Intent(context,Order.class);
                intent.putExtra("gambar",R.drawable.b7);
                intent.putExtra("teks","Hantu Tanah Jahanam");
                context.startActivity(intent);
            }
            if(dataItem.get(position).getName().equals("Makmum")){
                Intent intent = new Intent(context,Order.class);
                intent.putExtra("gambar", R.drawable.b8);
                intent.putExtra("teks","Makmum");
                context.startActivity(intent);
            }
            if(dataItem.get(position).getName().equals("Sebelum Iblis Menjemput")){
                Intent intent = new Intent(context,Order.class);
                intent.putExtra("gambar",R.drawable.b9);
                intent.putExtra("teks","Sebelum Iblis Menjemput");
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return dataItem.size();
    }


}
