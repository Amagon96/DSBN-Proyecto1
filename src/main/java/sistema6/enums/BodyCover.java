package sistema6.enums;

public enum BodyCover {
    PLUMAS(Boolean.TRUE, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE),
    PELAJE(Boolean.FALSE, Boolean.TRUE, Boolean.FALSE, Boolean.FALSE),
    ESCAMAS(Boolean.FALSE, Boolean.FALSE, Boolean.TRUE, Boolean.FALSE),
    PIEL(Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, Boolean.TRUE);

    private Boolean plumas;
    private Boolean pelaje;
    private Boolean escamas;
    private Boolean piel;

    BodyCover(Boolean plumas, Boolean pelaje, Boolean escamas, Boolean piel){
        this.plumas = plumas;
        this.escamas = escamas;
        this.pelaje = pelaje;
        this.piel = piel;
    }

    public Boolean getPlumas() {
        return plumas;
    }

    public Boolean getPelaje() {
        return pelaje;
    }

    public Boolean getEscamas() {
        return escamas;
    }

    public Boolean getPiel() {
        return piel;
    }
}
