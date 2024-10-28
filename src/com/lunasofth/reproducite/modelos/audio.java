package com.lunasofth.reproducite.modelos;

public class audio {

    private String titulo ;
    private int cantidadDeRepro;
    private int likes;
    private int clasificacion;

    public void megustas (){
        this.likes++;

    }
    public void cantidadDeReproduccion(){
        this.cantidadDeRepro++;

    }

    public int getCantidadDeRepro() {
        return cantidadDeRepro;
    }

    public void setCantidadDeRepro(int cantidadDeRepro) {
        this.cantidadDeRepro = cantidadDeRepro;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(int clasificacion) {
        this.clasificacion = clasificacion;
    }


}

