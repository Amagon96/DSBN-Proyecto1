package sistema5.enums;

public enum Productos {
    DORITOS("Doritos", 11.00),
    COCA("Coca-Cola", 10.00),
    CHOCKYS("Galletas Chockys", 10.00);

    private String descripcion;
    private Double precio;

    Productos(String descripcion, Double precio) {
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Double getPrecio() {
        return precio;
    }
}
