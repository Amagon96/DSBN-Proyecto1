package sistema2.transportes;

import sistema2.subtypes.Aereo;

public class Avion extends Aereo {

    public Avion() {
    }

    @Override
    public String manejar() {
        return "Me manejo como un transporte aereo que se llama avión";
    }

    @Override
    public String encender() {
        return "Me enciendo como un transporte aereo que se llama avión";
    }
}
