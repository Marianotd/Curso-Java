package test;

import domain.*;

public class TestSobreescritura {
    public static void main(String[] args) {
//        Gerente gerente1 = new Gerente("Juan", 5000, "Sistemas");
//        System.out.println("gerente1 = " + gerente1.obtenerDetalles());

        Empleado empleado = new Empleado("Juan", 5000);
//        System.out.println("empleado = " + empleado.obtenerDetalles());
        imprimir(empleado);
        
        empleado = new Gerente("Karla", 10000, "Contabilidad");
//        System.out.println("gerente = " + gerente.obtenerDetalles());
        imprimir(empleado);
    }
    
    public static void imprimir(Empleado empleado){
        String detalle = empleado.obtenerDetalles();
        System.out.println("detalle = " + detalle);
    }
}
