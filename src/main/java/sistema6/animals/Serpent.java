package sistema6.animals;

import sistema6.subTypes.Carnivorous;

/**
 * Modelo de un Serpiente en el sistema
 * @author andree amaro
 * @since 1.0
 * @version 1.0
 */
public class Serpent extends Carnivorous{

    /**
     * Constructor de una Serpiente
     */
    public Serpent() {
    }

    @Override
    public String toString(){
        return "Serpiente";
    }
    
    @Override
    public void eat(){
        System.out.println("Yo eat como una serpiente");
    }
}
