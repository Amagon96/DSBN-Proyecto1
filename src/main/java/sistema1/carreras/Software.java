package sistema1.carreras;

import sistema1.Ingenieria;
import sistema1.enums.Modalidad;

public abstract class Software extends Ingenieria {

    public Software() {
        this.setSemestres(8);
        this.setModalidad(Modalidad.PRESENCIAL);
        this.setInscripcion(4000);
        this.setMinimaAprobatoria((double)6);
    }
}
