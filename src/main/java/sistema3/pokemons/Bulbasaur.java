package sistema3.pokemons;

import sistema3.enums.Genero;
import sistema3.enums.Habilidades;
import sistema3.enums.Tipo;
import sistema3.subtypes.Planta;

import java.awt.*;

public class Bulbasaur extends Planta {

    public Bulbasaur() {
        this.setAltura(0.7d);
        this.setColor(Color.GREEN);
        this.setPeso(6.9d);
        this.setGrupoHuevo("Monstruo, Planta");
        this.setGenero(Genero.MASCULINO);
        this.setHabitat("Pradera");
        this.setNoPokedex(004);
        this.setHabilidades(Habilidades.ESPESURA);
        this.setTipo(Tipo.PLANTA);
    }

    public void atacar(Tipo tipo, Habilidades habilidades) {
        String efectividad = "";
        efectividad = getEfectividadAsStr(tipo, habilidades);
        System.out.println("efectividad = " + efectividad);
    }

    public String getEfectividadAsStr(Tipo tipo, Habilidades habilidades) {
        String efectividad;
        if (tipo.equals(Tipo.PLANTA) && habilidades.equals(Habilidades.ESPESURA)) {
            efectividad = "Super Efectivo";
        }else if (tipo.equals(Tipo.PLANTA) || habilidades.equals(Habilidades.ESPESURA)) {
            efectividad = "Efectivo";
        }else{
            efectividad = "Poco Efectivo";
        }
        return efectividad;
    }

    @Override
    public String toString() {
        return "Bulbasaur. Carga la semilla de una planta en su espalda desde el nacimiento, la semilla se desarrolla lentamente. Los investigadores no saben si calificarlo como una planta o animal. Es extremadamente feroz y muy difícil de capturar en el bosque.";
    }

    public static void main(String[] args) {
        Bulbasaur b = new Bulbasaur();
        b.setTipo(Tipo.FUEGO);
        b.setHabilidades(Habilidades.MARLLAMAS);
        System.out.println("Tipo = " + b.toString());
        b.atacar(b.getTipo(), b.getHabilidades());
    }
}
