package sistema3;

import sistema3.enums.Genero;
import sistema3.enums.Habilidades;
import sistema3.enums.Tipo;

import java.awt.*;

public class Pokemon {

    private Double peso;
    private Double altura;
    private Integer noPokedex;
    private String grupoHuevo;
    private Genero genero;
    private Color color;
    private String habitat;
    private Habilidades habilidades;
    private Tipo tipo;

    public Pokemon() {
        this.peso = peso;
        this.altura = altura;
        this.noPokedex = noPokedex;
        this.grupoHuevo = grupoHuevo;
        this.genero = genero;
        this.color = color;
        this.habitat = habitat;
        this.habilidades = Habilidades.TORRENTE;
        this.tipo = Tipo.AGUA;
    }

    @Override
    public String toString() {
        return "Soy un Pokemon";
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Integer getNoPokedex() {
        return noPokedex;
    }

    public void setNoPokedex(Integer noPokedex) {
        this.noPokedex = noPokedex;
    }

    public String getGrupoHuevo() {
        return grupoHuevo;
    }

    public void setGrupoHuevo(String grupoHuevo) {
        this.grupoHuevo = grupoHuevo;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public Habilidades getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(Habilidades habilidades) {
        this.habilidades = habilidades;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
}
