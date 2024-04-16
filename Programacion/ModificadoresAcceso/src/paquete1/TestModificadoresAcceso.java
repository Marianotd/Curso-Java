package paquete1;

import paquete1.Clase1;
//import paquete2.ClaseHija;

public class TestModificadoresAcceso {
    public static void main(String[] args) {
//        Clase1 clase1 = new Clase1();
//        System.out.println("clase1 atributo publico = " + clase1.atributoPublico);
//        clase1.metodoPublico();
        
//        Clase1 clase1 = new Clase1("Publico");
//        System.out.println("clase1 = " + clase1);
//        ClaseHija claseHija = new ClaseHija();
//        System.out.println("claseHija = " + claseHija);

//        Clase1 clase1 = new Clase1();
//        clase1.atributoDefault = "Cambio desde la prueba";
//        System.out.println("clase1 atributo default = " + clase1.atributoDefault);
//        clase1.metodoDefault();

        Clase1 clase1 = new Clase1("Publico");
        clase1.setAtributoPrivado(clase1.getAtributoPrivado());
        System.out.println("clase1 = " + clase1.getAtributoPrivado());
    }
}
