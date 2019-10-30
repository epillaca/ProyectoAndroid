package com.proyecto.brigadapets.adapters;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

import com.proyecto.brigadapets.Clases.Publicacion;
import com.proyecto.brigadapets.R;

import java.util.List;

public class PublicacionAdapter extends RecyclerView.Adapter<PublicacionAdapter.MyViewHolder> {

    private List<Publicacion> publicacionList;

    public class MyViewHolder extends RecyclerView.ViewHolder {

        public TextView titulo, detalle;
        public ImageView imagen;

        public MyViewHolder(View view) {
            super(view);
            titulo = (TextView) view.findViewById(R.id.titulo);
            detalle = (TextView) view.findViewById(R.id.detalle);
            imagen= (ImageView) itemView.findViewById(R.id.imagen);
        }
    }


    public PublicacionAdapter(List<Publicacion> publicacionList) {
        this.publicacionList = publicacionList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_list_busqueda, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Publicacion publicacion = publicacionList.get(position);
        holder.titulo.setText(publicacion.getTitulo());
        holder.detalle.setText(publicacion.getDetalle());
        holder.imagen.setImageResource(publicacion.getImagenId());
    }

    @Override
    public int getItemCount() {
        return publicacionList.size();
    }
}
