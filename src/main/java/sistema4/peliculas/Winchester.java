package sistema4.peliculas;

import sistema3.enums.Genero;
import sistema4.sucursales.FasionMall;

public class Winchester extends FasionMall{

    public Winchester() {

    }

    @Override
    public String toString() {
        return "'Winchester: The House that Ghosts Built'.";
    }

    public void proyectar(String pelicula) {
        System.out.println("Se esta proyectando la pelicula: " + pelicula);
    }

    public static void main(String[] args) {
        Winchester w = new Winchester();

        w.proyectar(w.toString());
    }
}
