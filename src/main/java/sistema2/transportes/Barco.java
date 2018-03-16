package sistema2.transportes;

import sistema2.subtypes.Acuatico;

public class Barco extends Acuatico {

    public Barco() {
    }

    @Override
    public String manejar() {
        return "Me manejo como un transporte acuatico que se llama barco";
    }

    @Override
    public String encender() {
        return "Me enciendo como un transporte acuatico que se llama barco";
    }
}
