package sistema4;

import sistema4.interfaces.Acciones;
import sistema4.enums.Genero;
import sistema4.enums.Lenguaje;

public abstract class Cine implements Acciones {

    private Genero genero;
    private Lenguaje lenguaje;
    private Boolean dulceria;

    public Cine() {
    }

    public Cine(Genero genero, Lenguaje lenguaje, Boolean dulceria) {
        this.genero = genero;
        this.lenguaje = lenguaje;
        this.dulceria = Boolean.TRUE;
    }

    @Override
    public String toString() {
        return "Soy un cine";
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Lenguaje getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(Lenguaje lenguaje) {
        this.lenguaje = lenguaje;
    }

    public Boolean getDulceria() {
        return dulceria;
    }

    public void setDulceria(Boolean dulceria) {
        this.dulceria = dulceria;
    }
}
