package test;

import java.util.*;

public class TestColeccionesGenericas {

    public static void main(String[] args) {
        List<String> miLista = new ArrayList<>();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Viernes");
        
//        String elemento = miLista.get(0);
//        System.out.println("elemento = " + elemento);

//        for (Object elemento: miLista) {
//            System.out.println("elemento = " + elemento);
//        }
//        miLista.forEach(elemento -> {
//            System.out.println("elemento = " + elemento);
//        });
//        imprimir(miLista);

        Set<String> miSet = new HashSet<>();
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
        miSet.add("Viernes");
        
//        imprimir(miSet);

        Map<String, String> miMapa = new HashMap<>();
        miMapa.put("Valor1", "Juan");
        miMapa.put("Valor2", "Karla");
        miMapa.put("Valor3", "Rosario");
        miMapa.put("Valor3", "Carlos");

//        String elemento = (String) miMapa.get("Valor1");
//        System.out.println("elemento = " + elemento);
//        String elementoMapa= miMapa.get("Valor1");
//        System.out.println("elementoMapa = " + elementoMapa);
        imprimir(miMapa.keySet());
        imprimir(miMapa.values());

    }

    public static void imprimir(Collection<String> coleccion) {
        coleccion.forEach(elemento -> {
            System.out.println("elemento = " + elemento);
        });
    }
}
