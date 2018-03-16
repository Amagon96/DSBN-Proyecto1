package sistema5.empleados;

import sistema5.enums.Productos;
import sistema5.sucursales.Sucursal4;

public class Empleado3 extends Sucursal4{
    private String nombre;
    private Integer edad;
    private String puesto;

    public Empleado3() {
        this.nombre = "Melissa";
        this.edad = 21;
        this.puesto = "Vendedora";
    }

    public Empleado3(String nombre, Integer edad, String puesto) {
        this.nombre = nombre;
        this.edad = edad;
        this.puesto = puesto;
    }

    @Override
    public Double iva(Productos precioProducto, Double iva) {
        iva += precioProducto.getPrecio() * iva;
        return iva;
    }

    @Override
    public void vender(Productos producto, Double precio) {
        precio = iva(producto, precio);
        System.out.println(String.format("Hola soy %s, tengo %s años y yo sere su %s, su producto tiene un precio de: %s", nombre, edad, puesto, precio));

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

}
