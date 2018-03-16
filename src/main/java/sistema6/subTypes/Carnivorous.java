package sistema6.subTypes;

import sistema6.Animal;
import sistema6.interfaces.Consumer;

public class Carnivorous extends Animal implements Consumer {

    @Override
    public void eat() {
        System.out.println("Yo eat like an animal carnivoro ñom ñom ñom");
    }

    @Override
    public String toString(){
        return "Soy un Carnivoro";
    }
}
