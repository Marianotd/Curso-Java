package beans.model;

import java.util.Date;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import org.apache.logging.log4j.*;

@Named
@RequestScoped
public class Candidato {

    private String nombre;
    private String apellido;
    private int salarioDeseado;
    private Date fechaNacimiento;

    public Candidato() {
        log.info("Creando el objeto Candidato");
    }

    Logger log = LogManager.getRootLogger();

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
        log.info("Modificando la propiedad de nombre:" + this.nombre);
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
        log.info("Modificando la propiedad de apellido: " + this.apellido);
    }

    public int getSalarioDeseado() {
        return this.salarioDeseado;
    }

    public void setSalarioDeseado(int salarioDeseado) {
        this.salarioDeseado = salarioDeseado;
        log.info("Modificando la propiedad salarioDeseado: " + this.salarioDeseado);
    }

    public Date getFechaNacimiento() {
        return this.fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
        log.info("Modificando la propiedad fechaNacimiento: " + this.fechaNacimiento);
    }

}
