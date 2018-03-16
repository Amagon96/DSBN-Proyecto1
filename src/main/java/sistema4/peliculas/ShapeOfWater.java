package sistema4.peliculas;

import sistema4.enums.Genero;
import sistema4.enums.Lenguaje;
import sistema4.sucursales.Vallarta;

public class ShapeOfWater extends Vallarta{

    public ShapeOfWater() {
        this.setGenero(Genero.ROMANCE);
        this.setLenguaje(Lenguaje.ING);
    }


    @Override
    public String toString() {
        return "'The Shape Of Water'.";
    }

    public void proyectar(String pelicula) {

    }
}
