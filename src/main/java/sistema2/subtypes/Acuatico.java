package sistema2.subtypes;

import sistema2.Transporte;

public class Acuatico extends Transporte{

    public Acuatico() {
    }

    @Override
    public String manejar() {
        return "Me manejo como un transporte acuatico";
    }

    @Override
    public String encender() {
        return "Me enciendo como un transporte acuatico";
    }
}
