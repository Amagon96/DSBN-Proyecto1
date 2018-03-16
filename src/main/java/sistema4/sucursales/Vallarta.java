package sistema4.sucursales;

import sistema4.Cine;

public abstract class Vallarta extends Cine{

    public Vallarta() {
        this.setDulceria(Boolean.TRUE);
    }

    public void hasDulceria() {
        if (this.getDulceria()) {
            System.out.println("Esta sucursal si cuenta con dulceria");
        }else {
            System.out.println("Esta sucursal no cuenta con dulceria");
        }
    }

    @Override
    public String toString() {
        return "Sucursal Vallarta";
    }

}
