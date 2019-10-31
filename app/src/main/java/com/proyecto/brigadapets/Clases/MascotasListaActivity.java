package com.proyecto.brigadapets.Clases;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.proyecto.brigadapets.R;
import com.proyecto.brigadapets.adapters.PostAdapter;

import java.util.ArrayList;

public class MascotasListaActivity extends AppCompatActivity {

    private RecyclerView rvMusicas;
    private GridLayoutManager glm;
    private PostAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_busqueda);

        rvMusicas = (RecyclerView) findViewById(R.id.recycler_post);

        glm = new GridLayoutManager(this, 2);
        rvMusicas.setLayoutManager(glm);
        adapter = new PostAdapter(dataSet());
        rvMusicas.setAdapter(adapter);

    }

    private ArrayList<Publicacion> dataSet() {
        ArrayList<Publicacion> data = new ArrayList<>();
        data.add(new Publicacion("Radioactive", "Imagine Dragons", R.drawable.beagle));
        data.add(new Publicacion("Radioactive", "Imagine Dragons", R.drawable.beagle));
        data.add(new Publicacion("Radioactive", "Imagine Dragons", R.drawable.beagle));
        data.add(new Publicacion("Radioactive", "Imagine Dragons", R.drawable.beagle));
        data.add(new Publicacion("Radioactive", "Imagine Dragons", R.drawable.beagle));
        data.add(new Publicacion("Radioactive", "Imagine Dragons", R.drawable.beagle));
        return data;
    }
}