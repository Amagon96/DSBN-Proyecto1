package sistema5.empleados;

import sistema5.enums.Productos;
import sistema5.sucursales.Sucursal2;

public class Empleado2 extends Sucursal2 {
    private String nombre;
    private Integer edad;
    private String puesto;

    public Empleado2() {
        this.nombre = "Pedro";
        this.edad = 25;
        this.puesto = "Gerente";
    }

    public Empleado2(String nombre, Integer edad, String puesto) {
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
        System.out.println(String.format("Hola soy %s, tengo %s años y yo sere su %s asignado, su producto tiene un precio de: %s", nombre, edad, puesto, precio));

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
