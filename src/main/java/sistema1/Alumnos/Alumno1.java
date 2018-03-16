package sistema1.Alumnos;

import sistema1.carreras.Aeroespacial;

public class Alumno1 extends Aeroespacial {

    public void promedio(Integer ...args) {
        Double promedio = 0d;
        for (Integer i : args) {
            promedio += i;
        }
        promedio = promedio/(double)args.length;
        if (promedio < this.getMinimaAprobatoria()) {
            System.out.println(String.format("Su promedio (%s) no cumple con la minima aprobatoria", promedio));
        }else{
            System.out.println(String.format("Felicidades su promedio (%s) es aprobatorio", promedio));
        }
    }

    public static void main(String[] args) {
        Alumno1 a1 = new Alumno1();

        a1.promedio(6, 0, 1);
    }
}
