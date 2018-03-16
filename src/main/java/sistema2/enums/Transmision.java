package sistema2.enums;

public enum Transmision {

    MANUAL("Transmision manual"),
    AUTOMATICO("Transmision automatica");

    private String transmision;

    Transmision(String transmision) {
        this.transmision = transmision;
    }

    public String getTransmision() {
        return transmision;
    }
}
