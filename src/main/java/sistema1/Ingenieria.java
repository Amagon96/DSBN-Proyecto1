package sistema1;

import sistema1.enums.Modalidad;
import sistema1.interfaces.Acciones;

public abstract class Ingenieria implements Acciones{

    private Integer semestres;
    private Modalidad modalidad;
    public Integer inscripcion;
    private Double minimaAprobatoria;

    public Ingenieria() {
    }

    public Ingenieria(Integer semestres, Modalidad modalidad, Integer inscripcion) {
        this.semestres = 9;
        this.modalidad = Modalidad.MIXTA;
        this.inscripcion = inscripcion;
    }

    @Override
    public String toString() {
        return "Ingeniería";
    }

    public Integer getSemestres() {
        return semestres;
    }

    public void setSemestres(Integer semestres) {
        this.semestres = semestres;
    }

    public Modalidad getModalidad() {
        return modalidad;
    }

    public void setModalidad(Modalidad modalidad) {
        this.modalidad = modalidad;
    }

    public Integer getInscripcion() {
        return inscripcion;
    }

    public void setInscripcion(Integer inscripcion) {
        this.inscripcion = inscripcion;
    }

    public Double getMinimaAprobatoria() {
        return minimaAprobatoria;
    }

    public void setMinimaAprobatoria(Double minimaAprobatoria) {
        this.minimaAprobatoria = minimaAprobatoria;
    }
}
