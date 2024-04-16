package domain;

public class Persona {
    private final int idPersona;
    private static int contadorPersonas;
    
    static {
        System.out.println("Ejecucion bloque estatico");
        ++Persona.contadorPersonas;
//        idPersona = 10;
    }
    
    {
        System.out.println("Ejecucion bloque NO estatico");
        this.idPersona = Persona.contadorPersonas++;
    }
    
    public Persona(){
        System.out.println("Ejecucion del constructor");
    }

    public int getIdPersona() {
        return this.idPersona;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{");
        sb.append("idPersona=").append(idPersona);
        sb.append('}');
        return sb.toString();
    }
}
