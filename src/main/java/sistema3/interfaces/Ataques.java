package sistema3.interfaces;

import sistema3.enums.Habilidades;
import sistema3.enums.Tipo;

public interface Ataques {
    public void atacar(Tipo tipo, Habilidades habilidades);
    public  String getEfectividadAsStr(Tipo tipo, Habilidades habilidades);
}
