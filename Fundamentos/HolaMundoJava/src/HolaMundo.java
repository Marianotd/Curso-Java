
import java.util.Scanner;

// Hola Mundo desde Java
public class HolaMundo {

    /* public static void main(String args[]){
        System.out.println("Hola Mundo desde Java");
        
        int miVariableEntera = 10;
        System.out.println(miVariableEntera);
        
        // Modificamos el valor de la variable
        miVariableEntera = 5;
        System.out.println(miVariableEntera);
        
        String miVariableCadena = "Saludos";
        System.out.println(miVariableCadena);
        
        miVariableCadena = "Adios";
        System.out.println(miVariableCadena);
        
        // var - Inferencia de tipos en Java
        var miVariableEntera2 = 15;
        System.out.println(miVariableEntera2);
        
        var miVariableCadena2 = "Nueva Cadena";
        System.out.println("miVariableCadena2 = " + miVariableCadena2);
        
        // Valores permitidos en el nombre de variables
        var miVariable = 1;
        var _miVariable = 2;
        var $miVariable = 3;
        // var áVariable = 10; No se recomienda utilizar
        // var #miVariable = 2; No se permite utilizar caracteres especiales
    } */

    /* public static void main(String args[]){
        var usuario = "Juan";
        var titulo = "Ingeniero";
        var union = usuario + " " + titulo;
        System.out.println("union = " + union);
        
        var i = 3;
        var j = 4;
        
        System.out.println(i + j); // Se realiza la suma de numeros
        System.out.println(i + j + usuario); // Evaluacion de izq a der, realiza suma
        System.out.println(usuario + i + j); // Contexto cadena, todo es una cadena
        System.out.println(usuario + (i + j)); // Uso de parentesis modifican la prioridad en la evaluacion
    } */
    
    /* public static void main(String args[]) {
        var nombre = "Karla";

        System.out.println("Nueva linea: \n" + nombre);
        System.out.println("Tabulador: \t" + nombre);
        System.out.println("Retroceso: \b" + nombre);
        System.out.println("Comilla simple: \'" + nombre + "\'");
        System.out.println("Comilla doble: \"" + nombre + "\"");
    } */
    
    /* public static void main(String args[]) {
        System.out.println("Escribe tu nombre:");
        Scanner consola = new Scanner(System.in);
        var usuario = consola.nextLine();
        System.out.println("usuario = " + usuario);
        System.out.println("Escribe el titulo:");
        var titulo = consola.nextLine();
        System.out.println("Resultado: " + titulo + " " + usuario);
    } */
    
    /* public static void main(String args[]){
        // tipos primitivos enteros: byte, short, int, long
        
        byte numeroByte = (byte)129;
        System.out.println("Valor byte: " + numeroByte);
        System.out.println("Valor minimo byte: " + Byte.MIN_VALUE);
        System.out.println("Valos maximo byte: " + Byte.MAX_VALUE);
        
        short numeroShort = (short)32768;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("Valor minimo short: " + Short.MIN_VALUE);
        System.out.println("Valor maximo short: " + Short.MAX_VALUE);
        
        int numeroInt = (int)2147483648L;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("Valor minimo int: " + Integer.MIN_VALUE);
        System.out.println("Valor maximo int: " + Integer.MAX_VALUE);
        
        long numeroLong = 9223372036854775807L;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("Valor minimo long: " + Long.MIN_VALUE);
        System.out.println("Valor maximo long: " + Long.MAX_VALUE);
        
        
        // tipos primitivos de tipo flotante: float y double
        
        float numeroFloat = (float)3.4028235E38D;
        System.out.println("numeroFloat = " + numeroFloat);
        System.out.println("Valor minimo tipo float: " + Float.MIN_VALUE);
        System.out.println("Valor maximo tipo float: " + Float.MAX_VALUE);
        
        double numeroDouble = 1.7976931348623157E308;
        System.out.println("numeroDouble = " + numeroDouble);
        System.out.println("Valor minimo tipo double: " + Double.MIN_VALUE);
        System.out.println("Valor maximo tipo double: " + Double.MAX_VALUE);
    } */
    
    /* public static void main(String args[]){
        var numeroEntero = 10;
        System.out.println("numeroEntero = " + numeroEntero);
        
        var numeroDouble = 10.0;
        System.out.println("numeroDouble = " + numeroDouble);
        
        var numeroFloat = 10.0F;
        System.out.println("numeroFloat = " + numeroFloat);
    } */
    
    /* public static void main(String args[]){
        char miCaracter = 'a';
        System.out.println("miCaracter = " + miCaracter);
        
        char varChar = '\u0021';
        System.out.println("varChar = " + varChar);
        
        char varCharDecimal = 33;
        System.out.println("varCharDecimal = " + varCharDecimal);
        
        char varCharSimbolo = '!';
        System.out.println("varCharSimbolo = " + varCharSimbolo);
                
        var varChar1 = '\u0021';
        System.out.println("varChar1 = " + varChar1);
        
        var varCharDecimal2 = (char)33;
        System.out.println("varCharDecimal2 = " + varCharDecimal2);
        
        var varCharSimbolo3 = '!';
        System.out.println("varCharSimbolo3 = " + varCharSimbolo3);
        
        int variableEnteraSimbolo = '!';
        System.out.println("variableEnteraSimbolo = " + variableEnteraSimbolo);
        
        int letra = 'a';
        System.out.println("letra = " + letra);
    } */ 
    
    /* public static void main(String args[]){
        boolean varBoolean = true;
        System.out.println("varBoolean = " + varBoolean);
        
        if(varBoolean){
            System.out.println("La bandera es verdadera");
        } else {
            System.out.println("La bandera es falsa");
        }
        
        var edad = 10;
        var esAdulto = edad >= 18;
        if(esAdulto){
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }
    } */
    
    /* public static void main(String args[]){
        // Convertir tipo String a un tipo int
        var edad = Integer.parseInt("20");
        System.out.println("edad = " + (edad + 1));
        
        var valorPI = Double.parseDouble("3.1416");
        System.out.println("valorPI = " + valorPI);
        
        // Pedir un valor
        var consola = new Scanner(System.in);
        System.out.println("Proporciona tu edad:");
        edad = Integer.parseInt(consola.nextLine());
        System.out.println("edad = " + edad);
        
        var edadTexto = String.valueOf(10);
        System.out.println("edadTexto = " + edadTexto);
        
        var caracter = "hola".charAt(1);
        System.out.println("caracter = " + caracter);
        
        System.out.println("Proporciona un caracter:");
        caracter = consola.nextLine().charAt(0);
        
        System.out.println("caracter = " + caracter);
    } */
    
    /* public static void main(String args[]){
        int a = 3, b = 2;
        var resultado = a + b;
        System.out.println("resultado suma = " + resultado);
        
        resultado = a - b;
        System.out.println("resultado resta = " + resultado);
        
        resultado = a * b;
        System.out.println("resultado multiplicacion = " + resultado);
        
        var resultado2 = 3F / b;
        System.out.println("resultado2 division = " + resultado2);
        
        resultado = a % b;
        System.out.println("resultado modulo = " + resultado);
        
        if( b % 2 == 0)
            System.out.println("Es numero par");
        else
            System.out.println("Es numero impar");
    } */
    
    /* public static void main(String args[]){
        int a = 3, b = 2;
        int c = a + 5 - b;
        System.out.println("c = " + c);
        
        a += 1; // a = a + 1
        System.out.println("a = " + a);
        
        a += 3; // a = a + 3
        System.out.println("a = " + a);
        
        a -= 2; // a = a - 2
        System.out.println("a = " + a);
    } */
    
    /* public static void main(String args[]){
        var a = 3;
        var b = -a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        var c = true;
        var d = !c;
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        
        // incremento
        // 1. preincremento (simolo antes de la variable)
        var e = 3;
        var f = ++e; // primero se incrementa la variable y después se usa el valor
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        
        // 2. postincremento (simbolo despues de la variable)
        var g = 5;
        var h = g++; // primero se utiliza el valor y después se incrementa
        System.out.println("g = " + g); // teniamos pendiente un incremento
        System.out.println("h = " + h);
        
        // decremento
        // 1. predecremento
        var i = 2;
        var j = --i;
        System.out.println("i = " + i); // ya esta decrementada
        System.out.println("j = " + j);
        
        // 2. postdecremento
        var k = 4;
        var l = k--; // primero se usa el valor de la variable y queda pendiente decremento
        System.out.println("k = " + k); // tenia pendiente un decremento
        System.out.println("l = " + l);
    } */
    
    /* public static void main(String args[]){
        var a = 3;
        var b = 2;
        
        var c = (a == b);
        System.out.println("c = " + c);
        
        var d = a != b;
        System.out.println("d = " + d);
        
        var cadena = "Hola";
        var cadena2 = "Hola";
        var e = cadena == cadena2; // Compara referencias de objetos
        System.out.println("e = " + e);
        
        var f = cadena.equals(cadena2); // Comparamos contenido de cadenas
        System.out.println("f = " + f); 
        
        var g = a >= b; // mayor que >  el mayor o igual que >=
        System.out.println("g = " + g);
        
        if( a % 2 == 0){
            System.out.println("Es numero par");
        } else {
            System.out.println("Es numero impar");
        }
        
        var edad = 10;
        var adulto = 18;
        if(edad >= adulto){
            System.out.println("Es un adulto");
        } else {
            System.out.println("Es menor de edad");
        }
    } */

    /* public static void main(String args[]){
        var a = 8;
        var valorMinimo = 0;
        var valorMaximo = 10;
        
        var resultado = a >= valorMinimo && a <= valorMaximo;
        if(resultado){
            System.out.println("Dentro de rango");
        } else {
            System.out.println("Fuera de rango");
        }
        
        var vacaciones = true;
        var diaDescanso = false;
        
        if(vacaciones || diaDescanso){
            System.out.println("Padre puede asistir al juego del hijo");
        } else {
            System.out.println("El padre esta ocupado");
        }
    } */ 
    
    /* public static void main(String args[]){
        var resultado = (1 > 2) ? "Verdadero" : "Falso";
        System.out.println("resultado = " + resultado);
        
        var numero = 9;
        resultado = (numero % 2 == 0) ? "Numero par" : "Numero impar";
        System.out.println("resultado = " + resultado);
    } */
    
    /* public static void main(String args[]){
        var x = 5;
        var y = 10;
        var z = ++x + y--;
        
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        
        var resultado = 4 + 5 * 6 / 3; // 4 + ((5 * 6) / 3)
        System.out.println("resultado = " + resultado); // 14
        
        resultado = (4 + 5) * 6 / 3;
        System.out.println("resultado = " + resultado);
    } */
    
    /* public static void main(String args[]){
        var condicion = true;
        
        if(condicion){
            System.out.println("Condicion verdadera");
        } else {
            System.out.println("Condicion falsa");
        }
        
        var numero = 4;
        var numeroTexto = "Numero desconocido";
        
        if(numero == 1){
            numeroTexto = "Numero uno";
        } else if (numero == 2){
            numeroTexto = "Numero dos";
        } else if (numero == 3){
            numeroTexto = "Numero tres";
        } else if (numero == 4){
            numeroTexto = "Numero cuatro";
        } else {
            numeroTexto = "Numero no encontrado";
        }
        
        System.out.println("numeroTexto = " + numeroTexto);
    } */
    
    /* public static void main(String args[]){
        var mes = 4;
        var estacion = "Estacion desconocida";
        
        if(mes == 1 || mes == 2 || mes == 12){
            estacion = "Invierno";
        } else if(mes == 3 || mes == 4 || mes == 5){
            estacion = "Primavera";
        } else if(mes == 6 || mes == 7 || mes == 8){
            estacion = "Verano";
        } else if(mes == 9 || mes == 10 || mes == 11){
            estacion = "Otonio";
        }
        
        System.out.println("estacion = " + estacion);
    } */
    
    /* public static void main(String args[]){
        var numero = 3;
        var numeroTexto = "Valor desconocido";
        
        switch (numero) {
            case 1:
                numeroTexto = "Numero uno";
                break;
            case 2:
                numeroTexto = "Numero dos";
                break;
            case 3:
                numeroTexto = "Numero tres";
                break;
            case 4:
                numeroTexto = "Numero cuatro";
                break;
            default:
                numeroTexto = "Caso no encontrado";
        }
        
        System.out.println("numeroTexto = " + numeroTexto);
    } */
    
    /* public static void main(String args[]){
        var mes = 1;
        var estacion = "Estacion desconocida";
        
        switch (mes) {
            case 1: case 2: case 12:
                estacion = "Invierno";
                break;
            case 3: case 4: case 5:
                estacion = "Primavera";
                break;
            case 6: case 7: case 8:
                estacion = "Verano";
                break;
            case 9: case 10: case 11:
                estacion = "Otonio";
                break;
        }
        
        System.out.println("estacion = " + estacion);
    } */
    
    public static void main(String args[]){
        inicio:
        for(var contador = 0; contador < 3; contador++){
            if(contador % 2 != 0){
                continue inicio; // ir a la linea de codigo de la etiqueta
            }
            
            System.out.println("contador = " + contador);
        }
        
//        var contador = 0;
//        while(contador < 3){
//            System.out.println("contador = " + contador);
//            contador++;
//        }

//        var contador = 0;
//        do{
//            System.out.println("contador = " + contador);
//            contador++;
//        } while (contador < 3);
    }
    
}
