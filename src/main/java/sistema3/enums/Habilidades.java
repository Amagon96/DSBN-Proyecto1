package sistema3.enums;

public enum Habilidades {
    ESPESURA("Planta"),
    MARLLAMAS("Fuego"),
    TORRENTE("Agua");

    private String tipoBonus;

    Habilidades(String tipoBonus) {
        this.tipoBonus = tipoBonus;
    }
}
