package sistema5.sucursales;

import sistema5.Tienda;
import sistema5.enums.Sucursales;

public abstract class Sucursal3 extends Tienda{
    private Sucursales sucursales;
    private Double precioDoritos;
    private Double iva;

    public Sucursal3() {
        this.sucursales = Sucursales.SUCURSAL_3;
    }

    @Override
    public String toString() {
        return Sucursales.SUCURSAL_3.getDescripcion();
    }

}
