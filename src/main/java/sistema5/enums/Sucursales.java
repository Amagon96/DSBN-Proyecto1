package sistema5.enums;


public enum Sucursales {
    SUCURSAL_1("Sucursal uach", Productos.DORITOS, Productos.COCA, Productos.CHOCKYS, Boolean.TRUE,Boolean.TRUE,Boolean.TRUE),
    SUCURSAL_2("Sucursal niños heroes", Productos.DORITOS, Productos.COCA, Productos.CHOCKYS, Boolean.FALSE,Boolean.FALSE,Boolean.FALSE),
    SUCURSAL_3("Sucursal vallarta", Productos.DORITOS, Productos.COCA, Productos.CHOCKYS,Boolean.FALSE,Boolean.TRUE,Boolean.FALSE),
    SUCURSAL_4("Sucursal bolivar", Productos.DORITOS, Productos.COCA, Productos.CHOCKYS,Boolean.FALSE,Boolean.TRUE,Boolean.FALSE);

    private Productos doritos;
    private Productos coca;
    private Productos chockys;
    private String descripcion;
    private Double precio;
    private Boolean existenciaProducto1;
    private Boolean existenciaProducto2;
    private Boolean existenciaProducto3;

    Sucursales(String valor, Productos doritos, Productos coca, Productos chockys, Boolean existenciaProducto1, Boolean existenciaProducto2, Boolean existenciaProducto3) {
        descripcion = valor;
        this.doritos = doritos;
        this.coca = coca;
        this.chockys = chockys;
        this.existenciaProducto1 = existenciaProducto1;
        this.existenciaProducto2 = existenciaProducto2;
        this.existenciaProducto3 = existenciaProducto3;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
