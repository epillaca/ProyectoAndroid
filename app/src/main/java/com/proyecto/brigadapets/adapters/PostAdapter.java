package com.proyecto.brigadapets.adapters;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.proyecto.brigadapets.Clases.Publicacion;
import com.proyecto.brigadapets.R;

import java.util.ArrayList;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.PostViewHolder>{

    private ArrayList<Publicacion> data;

    public PostAdapter(ArrayList<Publicacion> data) {
        this.data = data;
    }

    @Override
    public PostViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new PostViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_busqueda, parent, false));
    }

    @Override
    public void onBindViewHolder(PostViewHolder holder, int position) {
        Publicacion publicacion = data.get(position);
        holder.imagen.setImageResource(publicacion.getImagen());
        holder.titulo.setText(publicacion.getTitulo());
        holder.detalle.setText(publicacion.getDetalle());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class PostViewHolder extends RecyclerView.ViewHolder{

        ImageView imagen;
        TextView titulo;
        TextView detalle;

        public PostViewHolder(View itemView) {
            super(itemView);
            imagen = (ImageView) itemView.findViewById(R.id.imagen);
            titulo = (TextView) itemView.findViewById(R.id.titulo);
            detalle = (TextView) itemView.findViewById(R.id.detalle);
        }
    }
}