package com.lunasofth.reproducite.modelos;

public class favorito {

    public void Adicion (audio audio){
        if (audio.getClasificacion() == 10){
            System.out.println("este audio " + audio.getTitulo() + " ha sido añadido a favoritos");
        }else {
            System.out.println(audio.getTitulo()+ "tambien puede ser uno de los favoritos");
        }
    }
}
