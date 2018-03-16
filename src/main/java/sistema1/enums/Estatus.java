package sistema1.enums;

public enum Estatus {
    INSCRITO("Inscrito"),
    PREINSCRITO("Preinscrito"),
    REINGRESO("Reingreso");

    private String descripcion;

    Estatus(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
