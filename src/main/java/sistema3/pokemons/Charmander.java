package sistema3.pokemons;

import sistema3.enums.Genero;
import sistema3.enums.Habilidades;
import sistema3.enums.Tipo;
import sistema3.interfaces.Ataques;
import sistema3.subtypes.Fuego;

import java.awt.*;

public class Charmander extends Fuego implements Ataques{

    public Charmander() {
        this.setAltura(0.6d);
        this.setColor(Color.RED);
        this.setPeso(8.5d);
        this.setGrupoHuevo("Monstruo, Dragón");
        this.setGenero(Genero.MASCULINO);
        this.setHabitat("Montaña");
        this.setNoPokedex(004);
        this.setHabilidades(Habilidades.MARLLAMAS);
        this.setTipo(Tipo.FUEGO);
    }

    public void atacar(Tipo tipo, Habilidades habilidades) {
        String efectividad = "";
        efectividad = getEfectividadAsStr(tipo, habilidades);
        System.out.println("efectividad = " + efectividad);
    }

    public String getEfectividadAsStr(Tipo tipo, Habilidades habilidades) {
        String efectividad;
        if (tipo.equals(Tipo.FUEGO) && habilidades.equals(Habilidades.MARLLAMAS)) {
            efectividad = "Super Efectivo";
        }else if (tipo.equals(Tipo.FUEGO) || habilidades.equals(Habilidades.MARLLAMAS)) {
            efectividad = "Efectivo";
        }else{
            efectividad = "Poco Efectivo";
        }
        return efectividad;
    }

    @Override
    public String toString() {
        return "Charmander. Una flama arde en la punta de su cola desde su nacimiento. Se dice que el Charmander muere si su flama llega a apagarse. ";
    }

    public static void main(String[] args) {
        Charmander c = new Charmander();
        c.setTipo(Tipo.FUEGO);
        c.setHabilidades(Habilidades.MARLLAMAS);
        c.atacar(c.getTipo(), c.getHabilidades());
    }
}
