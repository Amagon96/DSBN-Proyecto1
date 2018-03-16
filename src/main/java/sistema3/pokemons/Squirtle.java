package sistema3.pokemons;

import sistema3.enums.Genero;
import sistema3.enums.Habilidades;
import sistema3.enums.Tipo;
import sistema3.interfaces.Ataques;
import sistema3.subtypes.Agua;

import java.awt.*;

public class Squirtle extends Agua implements Ataques{

    public Squirtle() {
        this.setAltura(0.5d);
        this.setColor(Color.BLUE);
        this.setPeso(9.0d);
        this.setGrupoHuevo("Agua 1, Monstruo");
        this.setGenero(Genero.MASCULINO);
        this.setHabitat("Agua Dulce");
        this.setNoPokedex(007);
        this.setHabilidades(Habilidades.TORRENTE);
        this.setTipo(Tipo.AGUA);
    }


    public void atacar(Tipo tipo, Habilidades habilidades) {
        String efectividad = "";
        efectividad = getEfectividadAsStr(tipo, habilidades);
        System.out.println("efectividad = " + efectividad);
    }

    public String getEfectividadAsStr(Tipo tipo, Habilidades habilidades) {
        String efectividad;
        if (tipo.equals(Tipo.AGUA) && habilidades.equals(Habilidades.TORRENTE)) {
            efectividad = "Super Efectivo";
        }else if (tipo.equals(Tipo.AGUA) || habilidades.equals(Habilidades.TORRENTE)) {
            efectividad = "Efectivo";
        }else{
            efectividad = "Poco Efectivo";
        }
        return efectividad;
    }

    @Override
    public String toString() {
        return "Squirtle. Esta pequeña tortuga Pokémon jala su largo cuello hacia su caparazón para lanzar increíbles ataques de agua con sorprendente alcance y exactitud. El golpe puede ser muy poderoso. ";
    }

    public static void main(String[] args) {
        Squirtle s = new Squirtle();
        s.setTipo(Tipo.AGUA);
        s.setHabilidades(Habilidades.TORRENTE);
        s.atacar(s.getTipo(), s.getHabilidades());
    }

}
