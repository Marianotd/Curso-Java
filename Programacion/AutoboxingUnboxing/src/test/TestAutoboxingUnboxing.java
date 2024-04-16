package test;

public class TestAutoboxingUnboxing {
    public static void main(String[] args) {
        // Clases envolventes de tipos primitivos
        /*
        int - Integer
        long - Long
        float - Float
        double - Double
        boolean - Boolean
        byte - Byte
        char - Character
        short - Short
        */
        
        Integer entero = 10; // Autoboxing
        System.out.println("entero = " + entero);
        System.out.println("entero = " + entero.toString());
        System.out.println("entero = " + entero.doubleValue());
        
        int entero2 = entero; // Unboxing
        System.out.println("entero2 = " + entero2);
    }
}
