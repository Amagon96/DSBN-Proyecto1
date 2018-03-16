package sistema4.peliculas;

import sistema4.enums.Genero;
import sistema4.enums.Lenguaje;
import sistema4.sucursales.FasionMall;

public class MarcianosVsMexicanos extends FasionMall{

    public MarcianosVsMexicanos() {
        this.setGenero(Genero.COMEDIA);
        this.setLenguaje(Lenguaje.SUB);
    }

    @Override
    public String toString() {
        return "'Marcianos Vs Mexicanos'.";
    }

    public void proyectar(String pelicula) {
        System.out.println("Se esta proyectando la pelicula: " + pelicula);
    }
}
