package sistema1.carreras;

import sistema1.Ingenieria;
import sistema1.enums.Modalidad;

public abstract class Civil extends Ingenieria {

    public Civil() {
        this.setModalidad(Modalidad.MIXTA);
        this.setSemestres(9);
        this.setInscripcion(4500);
        this.setMinimaAprobatoria((double)6);
    }

    @Override
    public String toString() {
        return "Ingeniería civil";
    }

}
