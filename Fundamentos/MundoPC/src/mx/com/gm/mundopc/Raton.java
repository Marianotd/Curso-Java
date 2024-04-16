package mx.com.gm.mundopc;

public class Raton extends DispositivoEntrada {
    private final int idRaton;
    private static int contadorRatones;
    
    public Raton(String tipoEntrada, String marca){
        super(tipoEntrada, marca);
        this.idRaton = ++Raton.contadorRatones;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Raton{");
        sb.append("idRaton=").append(idRaton);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
