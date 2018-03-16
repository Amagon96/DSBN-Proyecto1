package sistema5.interfaces;

import sistema5.enums.Productos;

public interface Acciones {
    public Double iva(Productos precioProducto, Double iva);
    public void vender(Productos producto, Double precio);
}
