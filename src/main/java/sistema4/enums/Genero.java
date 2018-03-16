package sistema4.enums;

public enum Genero {
    TERROR("Terror"),
    COMEDIA("Comedia"),
    CIENCIA_FICCION("Ciencia Ficción"),
    ACCION("Acción"),
    ROMANCE("Romance");

    private String descripcion;

    Genero(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
