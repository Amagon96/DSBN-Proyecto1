package sistema5.sucursales;

import sistema5.Tienda;
import sistema5.enums.Sucursales;

public abstract class Sucursal4 extends Tienda {

    private Sucursales sucursales;
    private Double precioDoritos;
    private Double iva;

    public Sucursal4() {
        this.sucursales = Sucursales.SUCURSAL_4;
    }

    @Override
    public String toString() {
        return Sucursales.SUCURSAL_4.getDescripcion();
    }

}
