package test;

import domain.*;

public class TestInstanceOf {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Juan", 5000);
//        determinarTipo(empleado);
        empleado = new Gerente("Karla", 10000, "Contabilidad");
        determinarTipo(empleado);
        
    }
    
    public static void determinarTipo(Empleado empleado){
        if(empleado instanceof Gerente){
            System.out.println("Es de tipo gerente");
//            Gerente gerente = (Gerente)empleado;
//            System.out.println("gerente = " + gerente.getDepartamento());
            System.out.println("gerente = " + ((Gerente) empleado).getDepartamento());
        } else if (empleado instanceof Empleado){
            System.out.println("Es de tipo empleado");
//            Gerente gerente = (Gerente)empleado;
//            System.out.println("gerente = " + gerente.getDepartamento());
            System.out.println("empleado = " + empleado.getNombre());
        } else if(empleado instanceof Object){
            System.out.println("Es de tipo object");
            empleado.toString();
        }
    }
}
