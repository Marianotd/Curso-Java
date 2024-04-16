package test;

import static aritmetica.Aritmetica.division;
import excepciones.OperacionExcepcion;

public class TestExcepciones {

    public static void main(String[] args) {
        int resultado = 0;
        
        try {
            resultado = division(10, 0);
        } catch(OperacionExcepcion e ){
            StringBuilder sb = new StringBuilder("Ocurrio un error de tipo OperacionExcepcion: ");
            sb.append(e.getMessage());

            System.out.println(sb);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("Ocurrio un error de tipo Exception: ");
            sb.append(e.getMessage());
            System.out.println(sb);
//            e.printStackTrace(System.out);
        } finally {
            System.out.println("Se reviso la division entre cero");
        }

        System.out.println("resultado = " + resultado);
    }
}
