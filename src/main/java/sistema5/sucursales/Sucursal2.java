package sistema5.sucursales;

import sistema5.Tienda;
import sistema5.enums.Sucursales;

public abstract class Sucursal2 extends Tienda{
    private Sucursales sucursales;
    private Double precioDoritos;
    private Double iva;

    public Sucursal2() {
        this.sucursales = Sucursales.SUCURSAL_2;
    }

    @Override
    public String toString() {
        return Sucursales.SUCURSAL_2.getDescripcion();
    }

}

