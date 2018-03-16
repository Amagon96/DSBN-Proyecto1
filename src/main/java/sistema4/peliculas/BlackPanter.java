package sistema4.peliculas;

import sistema4.enums.Genero;
import sistema4.enums.Lenguaje;
import sistema4.sucursales.Sendero;

public class BlackPanter extends Sendero{

    public BlackPanter() {
        this.setGenero(Genero.CIENCIA_FICCION);
        this.setLenguaje(Lenguaje.ESP);
    }

    @Override
    public String toString() {
        return "'Black Panter'.";
    }

    public void proyectar(String pelicula) {
        System.out.println("Se esta proyectando la pelicula: " + pelicula);
    }
}
