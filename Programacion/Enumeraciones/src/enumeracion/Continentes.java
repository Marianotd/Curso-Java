package enumeracion;

public enum Continentes {
    AFRICA(53, "1.2 billones"),
    EUROPA(46, ""),
    ASIA(44, ""),
    AMERICA(34, ""),
    OCEANIA(14, "");
    
    private final int paises;
    private final String habitantes;
    
    Continentes(int paises, String habitantes){
        this.paises = paises;
        this.habitantes = habitantes;
    }
    
    public int getPaises(){
        return this.paises;
    }
}
