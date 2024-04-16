package test;

import enumeracion.*;

public class TestEnumeraciones {
    public static void main(String[] args) {
//        System.out.println("Dia 1: " + Dias.LUNES);
//        indicarDiaSemana(Dias.LUNES);
        
        System.out.println("Continente n° 4: " + Continentes.AMERICA);
        System.out.println("N° paises en el 4to continente: " + Continentes.AMERICA.getPaises());
        
        System.out.println("Continente n° 1: " + Continentes.AFRICA);
        System.out.println("N° paises en el 1er continente: " + Continentes.AFRICA.getPaises());
        
    }
    
    private static void indicarDiaSemana(Dias dias){
        switch (dias) {
            case LUNES:
                System.out.println("Primer dia de la semana");
                break;
            case MARTES:
                System.out.println("Segundo dia de la semana");
                break;
            default:
                System.out.println("Dia inexistente");
                break;
        }
    }
}
