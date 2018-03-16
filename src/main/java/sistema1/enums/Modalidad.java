package sistema1.enums;

public enum Modalidad {
    PRESENCIAL("Presencial"),
    VIRTUAL("Virtual"),
    MIXTA("Mixta");

    private String descripcion;

    Modalidad(String genero) {
        this.descripcion = genero;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
