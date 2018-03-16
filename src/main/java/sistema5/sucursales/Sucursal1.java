package sistema5.sucursales;

import sistema5.Tienda;
import sistema5.enums.Sucursales;

public abstract class Sucursal1 extends Tienda {
    private Sucursales sucursales;
    private Double precioDoritos;
    private Double iva;

    public Sucursal1() {
        this.sucursales = Sucursales.SUCURSAL_1;
    }

    @Override
    public String toString() {
        return Sucursales.SUCURSAL_1.getDescripcion();
    }

}
