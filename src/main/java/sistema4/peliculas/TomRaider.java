package sistema4.peliculas;

import sistema4.sucursales.Sendero;

public class TomRaider extends Sendero{

    public TomRaider() {
    }

    @Override
    public String toString() {
        return "'Tom Raider'.";
    }

    public void proyectar(String pelicula) {
        System.out.println("Se esta proyectando la pelicula: " + pelicula);
    }
}
