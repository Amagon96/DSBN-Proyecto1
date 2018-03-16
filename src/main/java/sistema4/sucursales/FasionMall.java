package sistema4.sucursales;

import sistema4.Cine;
import sistema4.enums.Genero;

public abstract class FasionMall extends Cine{

    public FasionMall() {
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
        return "Sucursal FasionMall";
    }
}
