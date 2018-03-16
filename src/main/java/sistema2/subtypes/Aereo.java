package sistema2.subtypes;

import sistema2.Transporte;

public class Aereo extends Transporte {

    public Aereo() {
    }

    @Override
    public String manejar() {
        return "Me manejo como un transporte aereo";
    }

    @Override
    public String encender() {
        return "Me enciendo como un transporte aereo";
    }
}
