package pasoporreferencia;

import clases.Persona;

public class PasoPorReferencia {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.nombre = "Juan";
        System.out.println("persona1 nombre: " + persona1.nombre);
        cambiarValor(persona1);
        System.out.println("persona1 cambio nombre: " + persona1.nombre);
    }
    
    public static Persona cambiarValor(Persona persona){
        if(persona == null){
            System.out.println("Valor de persona invalido: null");
            return null;
        }
        
        persona.nombre = "Karla";
        return persona;
    }
}
