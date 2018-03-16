package sistema1.carreras;

import sistema1.Ingenieria;
import sistema1.enums.Modalidad;

public abstract class Hardware extends Ingenieria {

    public Hardware() {
        this.setModalidad(Modalidad.PRESENCIAL);
        this.setSemestres(9);
        this.setInscripcion(4000);
        this.setMinimaAprobatoria((double)6);
    }
}
