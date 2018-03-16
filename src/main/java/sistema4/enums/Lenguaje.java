package sistema4.enums;

public enum Lenguaje {

    SUB("Subtitulada"),
    ESP("Español"),
    ING("Ingles");

    private String descripcion;

    Lenguaje(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
