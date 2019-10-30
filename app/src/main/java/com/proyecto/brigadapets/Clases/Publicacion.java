package com.proyecto.brigadapets.Clases;

public class Publicacion {
    private String titulo;
    private String detalle;
    private int imagen;

    public Publicacion(String titulo,String detalle, int imagen){
        this.titulo=titulo;
        this.detalle=detalle;
        this.imagen=imagen;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }
}
