package sistema2;

import sistema2.enums.Transmision;
import sistema2.interfaces.Acciones;

public class Transporte implements Acciones{

    private Integer ruedas;
    private Integer puertas;
    private Double altura;
    private Double peso;
    private Transmision transmision;

    public Transporte() {
        this.ruedas = 4;
        this.puertas = 4;
        this.altura = 0.1d;
        this.peso = 0.1d;
        this.transmision = Transmision.MANUAL;
    }

    public String manejar() {
        return "Me manejo como un transporte";
    }

    public String encender() {
        return "Me enciendo como un transporte";
    }

    public Integer getRuedas() {
        return ruedas;
    }

    public void setRuedas(Integer ruedas) {
        this.ruedas = ruedas;
    }

    public Integer getPuertas() {
        return puertas;
    }

    public void setPuertas(Integer puertas) {
        this.puertas = puertas;
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
}
