package sistema6;

import sistema6.enums.BodyCover;

import java.awt.*;

public class Animal{

    private Color color;
    private Integer patas;
    private Double altura;
    private Double peso;
    private BodyCover bodyCover;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Integer getPatas() {
        return patas;
    }

    public void setPatas(Integer patas) {
        this.patas = patas;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public BodyCover getBodyCover() {
        return bodyCover;
    }

    public void setBodyCover(BodyCover bodyCover) {
        this.bodyCover = bodyCover;
    }

    /**
     * Constructor para un animal
     */
    public Animal() {
        this.color = Color.BLACK;
        this. patas = 4;
        this.altura = 0.1d;
        this.peso = 0.1d;
        this.bodyCover = BodyCover.PIEL;
    }

    public Animal(Color color){
        this();
        this.setBodyCover(bodyCover);
    }

}
