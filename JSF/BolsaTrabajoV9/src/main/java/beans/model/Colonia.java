package beans.model;

public class Colonia {

    private int coloniaId;
    private String nombreColonia;
    private int codigoPostal;

    public Colonia() {
    }

    public Colonia(int coloniaId, String nombreColonia, int codigoPostal) {
        this.coloniaId = coloniaId;
        this.nombreColonia = nombreColonia;
        this.codigoPostal = codigoPostal;
    }

    public int getColoniaId() {
        return this.coloniaId;
    }

    public void setColoniaId(int coloniaId) {
        this.coloniaId = coloniaId;
    }

    public String getNombreColonia() {
        return this.nombreColonia;
    }

    public void setNombreColonia(String nombreColonia) {
        this.nombreColonia = nombreColonia;
    }

    public int getCodigoPostal() {
        return this.codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

}
