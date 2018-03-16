package sistema6.subTypes;

import sistema6.Animal;
import sistema6.interfaces.Consumer;

public class Herviborous extends Animal implements Consumer{

    @Override
    public void eat() {
        System.out.println("Yo eat like an animal hervíboro moo moo moo");
    }

    @Override
    public String toString(){
        return "Soy un herviboro";
    }
}
