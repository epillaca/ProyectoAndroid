package com.proyecto.brigadapets.Main;

import android.net.Uri;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import android.view.View;

import androidx.core.view.GravityCompat;
import androidx.appcompat.app.ActionBarDrawerToggle;

import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;
import com.proyecto.brigadapets.Fragmentos.Agenda;
import com.proyecto.brigadapets.Fragmentos.Ayuda;
import com.proyecto.brigadapets.Fragmentos.Busqueda;
import com.proyecto.brigadapets.Fragmentos.Denuncias;
import com.proyecto.brigadapets.Fragmentos.Home;
import com.proyecto.brigadapets.Fragmentos.MyPets;
import com.proyecto.brigadapets.Fragmentos.Notificaciones;
import com.proyecto.brigadapets.R;

import androidx.drawerlayout.widget.DrawerLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentManager;

import android.view.Menu;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener,
        Home.OnFragmentInteractionListener,
        MyPets.OnFragmentInteractionListener,
        Busqueda.OnFragmentInteractionListener,
        Notificaciones.OnFragmentInteractionListener,
        Agenda.OnFragmentInteractionListener,
        Denuncias.OnFragmentInteractionListener,
        Ayuda.OnFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        // Handle navigation view item clicks here(Habilita Fragmentos).
        FragmentManager fragmentManager= getSupportFragmentManager();


        if (id == R.id.nav_home) {
            // Handle the camera action
            fragmentManager.beginTransaction().replace(R.id.contenedor, new Home()).commit();
        } else if (id == R.id.nav_own) {
            fragmentManager.beginTransaction().replace(R.id.contenedor, new MyPets()).commit();
        } else if (id == R.id.nav_search) {
            fragmentManager.beginTransaction().replace(R.id.contenedor, new Busqueda()).commit();
        } else if (id == R.id.nav_alert) {
            fragmentManager.beginTransaction().replace(R.id.contenedor, new Notificaciones()).commit();
        } else if (id == R.id.nav_calendar) {
            fragmentManager.beginTransaction().replace(R.id.contenedor, new Agenda()).commit();
        } else if (id == R.id.nav_report) {
            fragmentManager.beginTransaction().replace(R.id.contenedor, new Denuncias()).commit();
        } else if (id == R.id.nav_help) {
            fragmentManager.beginTransaction().replace(R.id.contenedor, new Ayuda()).commit();
        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

}
