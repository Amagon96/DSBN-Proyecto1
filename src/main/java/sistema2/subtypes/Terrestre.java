package sistema2.subtypes;

import sistema2.Transporte;

public class Terrestre extends Transporte {

    public Terrestre() {
    }

    @Override
    public String encender() {
        return "Me enciendo como un transporte terrestre";
    }

    public String manejar() {
        return "Me manejo como un transporte terrestre";
    }
}
