package com.lunasofth.reproducite.modelos;

public class audio_libro extends audio  {

    private String narrador;
    private double duracionHora;
    private String genero;
    private String autor;
    private String descripcion;
    private int cantidadDeRepro;
    private int likes;

    public String getNarrador() {
        return narrador;
    }

    public void setNarrador(String narrador) {
        this.narrador = narrador;
    }

    public double getDuracionHora() {
        return duracionHora;
    }

    public void setDuracionHora(double duracionHora) {
        this.duracionHora = duracionHora;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public void setCantidadDeRepro(int cantidadDeRepro) {
        this.cantidadDeRepro = cantidadDeRepro;
    }

    @Override
    public void setLikes(int likes) {
        this.likes = likes;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override

    public int getCantidadDeRepro() {

        return cantidadDeRepro;

    }
    @Override
    public int getLikes() {

        return likes;

    }

}
