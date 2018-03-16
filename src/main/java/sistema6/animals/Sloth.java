package sistema6.animals;

import sistema6.subTypes.Herviborous;

/**
 * Modelo de un Perezoso en el sistema
 * @author andree amaro
 * @since 1.0
 * @version 1.0
 */
public class Sloth extends Herviborous {

    /**
     * Constructor de un Perozoso
     */
    public Sloth() {
    }

    @Override
    public void eat(){
        System.out.println("Yo eat como un perezoso");
    }

    @Override
    public String toString(){
        return "Perezoso";
    }
}
