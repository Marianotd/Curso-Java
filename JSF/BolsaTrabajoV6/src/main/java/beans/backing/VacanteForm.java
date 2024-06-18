package beans.backing;

import beans.model.Candidato;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.component.*;
import javax.faces.context.FacesContext;
import javax.faces.event.*;
import javax.inject.*;
import org.apache.logging.log4j.*;

@Named
@RequestScoped
public class VacanteForm {

    @Inject
    private Candidato candidato;

    private boolean comentarioEnviado;

    Logger log = LogManager.getRootLogger();

    public VacanteForm() {
        log.info("Creando el objeto VacanteForm");
    }

    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }

    public String enviar() {
        if (this.candidato.getNombre().equals("Juan")) {
            if (this.candidato.getApellido().equals("Perez")) {
                String msg = "Gracias, pero Juan Perez ya trabaja con nosotros.";
                FacesMessage facesMessage = new FacesMessage(FacesMessage.SEVERITY_ERROR, msg, msg);
                FacesContext facesContext = FacesContext.getCurrentInstance();
                String componentId = null; // Este es un mensaje global
                facesContext.addMessage(componentId, facesMessage);

                return "index";
            }
            log.info("Entrando al caso de exito");
            return "exito";
        } else {
            log.info("Entrando al caso de fallo");
            return "fallo";
        }
    }

    public void codigoPostalListener(ValueChangeEvent valueChangeEvent) {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        UIViewRoot uiViewRoot = facesContext.getViewRoot();
        String nuevoCodigoPostal = (String) valueChangeEvent.getNewValue();

        if ("03810".equals(nuevoCodigoPostal)) {
            UIInput coloniaInputText = (UIInput) uiViewRoot.findComponent("vacanteForm:colonia");
            String nuevaColonia = "Napoles";
            coloniaInputText.setValue(nuevaColonia);
            coloniaInputText.setSubmittedValue(nuevaColonia);

            UIInput ciudadInputText = (UIInput) uiViewRoot.findComponent("vacanteForm:ciudad");
            String nuevaCiudad = "Ciudad de Mexico";
            ciudadInputText.setValue(nuevaCiudad);
            ciudadInputText.setSubmittedValue(nuevaCiudad);

            facesContext.renderResponse();
        }
    }

    public void ocultarComentario(ActionEvent actionEvent) {
        this.comentarioEnviado = !this.comentarioEnviado;
    }

    public boolean isComentarioEnviado() {
        return this.comentarioEnviado;
    }

    public void setComentarioEnviado(boolean comentarioEnviado) {
        this.comentarioEnviado = comentarioEnviado;
    }
}
