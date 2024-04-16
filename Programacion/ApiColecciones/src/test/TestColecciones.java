package test;

import java.util.*;

public class TestColecciones {
    public static void main(String[] args) {
        List miLista = new ArrayList();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Viernes");
        
//        for (Object elemento: miLista) {
//            System.out.println("elemento = " + elemento);
//        }
        
//        miLista.forEach(elemento -> {
//            System.out.println("elemento = " + elemento);
//        });

//        imprimir(miLista);

        Set miSet = new HashSet();
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
        miSet.add("Viernes");
        
//        imprimir(miSet);
        
        Map miMapa = new HashMap();
        miMapa.put("Valor1", "Juan");
        miMapa.put("Valor2", "Karla");
        miMapa.put("Valor3", "Rosario");
        
//        String elemento = (String) miMapa.get("Valor1");
//        System.out.println("elemento = " + elemento);
        
        imprimir(miMapa.keySet());
        imprimir(miMapa.values());
        
        
    }
    
    public static void imprimir(Collection coleccion){
        coleccion.forEach(elemento ->{
            System.out.println("elemento = " + elemento);
        });
    }
}
