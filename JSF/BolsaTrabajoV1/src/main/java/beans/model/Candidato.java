package beans.model;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import org.apache.logging.log4j.*;

@Named
@RequestScoped
public class Candidato {

    private String nombre;
    private String apellido;
    private String salarioDeseado;

    public Candidato() {
        log.info("Creando el objeto Candidato");
        this.setNombre("Introduce tu nombre");
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

    public String getSalarioDeseado() {
        return this.salarioDeseado;
    }

    public void setSalarioDeseado(String salarioDeseado) {
        this.salarioDeseado = salarioDeseado;
        log.info("Modificando la propiedad salarioDeseado: " + this.salarioDeseado);
    }

}
