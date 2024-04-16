package operaciones;

public class Aritmetica {
    // Atributos de la clase
    int a;
    int b;
    
    // Constructor vacio
    public Aritmetica(){
        System.out.println("Ejecutando constructor");
    }
    
    public Aritmetica(int a, int b){
        this.a = a;
        this.b = b;
        System.out.println("Ejecutando constructor con args");
    }
    
    // Metodo
    public void sumar(){
        int resultado = a + b;
        System.out.println("resultado = " + resultado);
    }
    
    public int sumarConRetorno(){
        return this.a + this.b;
    }
    
    public int sumarConArgumentos(int a, int b){
        this.a = a;
        this.b = b;
        return this.sumarConRetorno();
    }
}
