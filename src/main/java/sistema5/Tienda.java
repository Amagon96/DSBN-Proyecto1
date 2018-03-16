package sistema5;

import sistema5.enums.Productos;
import sistema5.interfaces.Acciones;

public abstract class Tienda implements Acciones {

    private Integer numeroSucursales;
    private Integer numeroEmpleados;
    private String direccion;

    public Tienda(Integer numeroSucursales, Integer numeroEmpleados, String direccion) {
        this.numeroSucursales = 3;
        this.numeroEmpleados = 4;
        this.direccion = "Enrique Segoviano";
    }

    public Tienda() {
    }

    @Override
    public Double iva(Productos precioProducto, Double iva) {
        iva += precioProducto.getPrecio() * iva;
        return iva;
    }

    @Override
    public String toString() {
        return "Tienda de Juan";
    }

    public Integer getNumeroSucursales() {
        return numeroSucursales;
    }

    public void setNumeroSucursales(Integer numeroSucursales) {
        this.numeroSucursales = numeroSucursales;
    }

    public Integer getNumeroEmpleados() {
        return numeroEmpleados;
    }

    public void setNumeroEmpleados(Integer numeroEmpleados) {
        this.numeroEmpleados = numeroEmpleados;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

}
