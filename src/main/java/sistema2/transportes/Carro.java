package sistema2.transportes;


import sistema2.subtypes.Terrestre;

public class Carro extends Terrestre{

    public Carro() {
    }

    @Override
    public String encender() {
        return "Me manejo como un transporte terrestre que se llama carro";
    }

    @Override
    public String manejar() {
        return "Me manejo como un transporte terrestre que se llama carro";
    }
}
