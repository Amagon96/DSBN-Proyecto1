package sistema3.enums;

public enum Genero {
    FEMENINO(Boolean.TRUE),
    MASCULINO(Boolean.FALSE);

    private Boolean tieneCrias;

    Genero(Boolean tieneCrias) {
        this.tieneCrias = tieneCrias;
    }
}
