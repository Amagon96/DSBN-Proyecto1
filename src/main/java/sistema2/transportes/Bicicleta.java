package sistema2.transportes;


import sistema2.subtypes.Terrestre;

public class Bicicleta extends Terrestre{

    public Bicicleta() {
    }

    @Override
    public String manejar() {
        return "Me manejo como un transporte terresetre que se llama bicicleta";
    }
}
