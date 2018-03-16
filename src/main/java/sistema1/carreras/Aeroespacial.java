package sistema1.carreras;

import sistema1.Ingenieria;
import sistema1.enums.Modalidad;

public abstract class Aeroespacial extends Ingenieria {



    public Aeroespacial() {
        this.setModalidad(Modalidad.PRESENCIAL);
        this.setSemestres(9);
        this.setInscripcion(5000);
        this.setMinimaAprobatoria((double)7);
    }

    @Override
    public String toString() {
        return "Ingeniería Aeroespacial";
    }

}
