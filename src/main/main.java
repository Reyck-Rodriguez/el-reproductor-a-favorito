package main;

import com.lunasofth.reproducite.modelos.audio_libro;
import com.lunasofth.reproducite.modelos.favorito;
import com.lunasofth.reproducite.modelos.musicotas;

public class main {

    public static void main(String[] args) {

        musicotas cancion1= new musicotas();
        cancion1.setTitulo("te amo ");
        cancion1.setCantante("franco de vita");
        cancion1.setAlbum("Al norte del sur");
        cancion1.setDuracionMinutos(3.31);
        cancion1.setGenero("pop");
        cancion1.setFechaLanzamiento("1998");

        audio_libro libro1 = new audio_libro();
        libro1.setAutor("Gloria Cecilia Díaz");
        libro1.setDuracionHora(14);
        libro1.setTitulo("el valle de los cucuyos");
        libro1.setDescripcion("Jerónimo acompaña al Pajarero Perdido en su búsqueda" +
                " de las hermosas aves conocidas como alcaravanes. En esa aventura, " +
                "llena de imprevistos y episodios asombrosos, el niño que anhelaba conocer " +
                "a sus padres hallará el secreto de su origen y su identidad");
        libro1.setNarrador("Gloria Cecilia Díaz");
        libro1.setGenero("cuentos infantiles");


        for (int i = 0; i < 100; i++) {
            cancion1.megustas();

        }
        for (int i = 0; i < 1000; i++) {
            cancion1.cantidadDeReproduccion();
        }

        System.out.println("cantidad de reproducciones de "+ cancion1.getTitulo() +" : " + cancion1.getCantidadDeRepro());
        System.out.println(cancion1.getTitulo() + " me gusta, tiene: " + cancion1.getLikes());

        for (int i = 0; i < 150; i++) {
            libro1.megustas();
        }
        for (int i = 0; i < 1100; i++) {
            libro1.cantidadDeReproduccion();
        }

        System.out.println("este libro "+ libro1.getTitulo() +" se ha reproducido: " + libro1.getCantidadDeRepro());
        System.out.println("el libro "+ libro1.getTitulo() + " me gusta, tiene: " + libro1.getLikes());


        favorito favoritos = new favorito();
        favoritos.Adicion(cancion1);
        favoritos.Adicion(libro1);
    }
}
