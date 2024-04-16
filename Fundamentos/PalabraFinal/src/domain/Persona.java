package domain;

public final class Persona {
    public final static int MI_CONSTANTE = 1;
    
    private String nombre;
    
    public final void imprimir(){
        System.out.println("Metodo imprimir");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
