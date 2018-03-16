package sistema6.animals;

import sistema6.subTypes.Carnivorous;

/**
 * Modelo de un Tigre en el sistema
 * @author andree amaro
 * @since 1.0
 * @version 1.0
 */

public class Tiger extends Carnivorous{

    /**
     * Constructor de un Tigre
     */
    public Tiger() {
    }

    @Override
    public String toString(){
        return "Tigre";
    }

    @Override
    public void eat(){
        System.out.println("Yo eat como un tigre");
    }
}
