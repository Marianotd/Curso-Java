package paquete1;

//public class Clase1 {
//    public String atributoPublico = "Valor atributo publico";
//    
//    public Clase1(){
//        System.out.println("Constructor publico");
//    }
//    
//    public void metodoPublico(){
//        System.out.println("Metodo publico");
//    }
//}


// protected class Clase1{
//public class Clase1 {
//    protected String atributoProtected = "Valor atributo protected";
//
//    protected Clase1(){
//        System.out.println("Constructor protected");
//    }
//    
//    public Clase1(String arg){
//        System.out.println("Constructor publico");
//    }
//    
//    protected void metodoProtected(){
//        System.out.println("Metodo protected");
//    }
//}

//class Clase1 {
//    String atributoDefault = "Valor atributo default;";
//    
//    Clase1(){
//        System.out.println("Constructor default");
//    }
//    
//    void metodoDefault(){
//        System.out.println("Metodo default");
//    }
//}

//private class Clase1 {
class Clase1 {
    private String atributoPrivado = "Valor atributo privado";
    
    private Clase1(){
        System.out.println("Constructor privado");
    }
    
    public Clase1(String argumento){
        this();
        System.out.println("Constructor publico");
    }
    
    private void metodoPrivado(){
        System.out.println("Metodo privado");
    }

    public String getAtributoPrivado() {
        return this.atributoPrivado;
    }

    public void setAtributoPrivado(String atributoPrivado) {
        this.atributoPrivado = atributoPrivado;
    }
}
