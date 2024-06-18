package beans.backing;

import beans.model.Candidato;
import javax.enterprise.context.RequestScoped;
import javax.inject.*;
import org.apache.logging.log4j.*;

@Named
@RequestScoped
public class VacanteForm {

    @Inject
    private Candidato candidato;

    Logger log = LogManager.getRootLogger();

    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }

    public String enviar() {
        if (this.candidato.getNombre().equals("Juan")) {
            log.info("Entrando al caso de exito");
            return "exito";
        } else {
            log.info("Entrando al caso de fallo");
            return "fallo";
        }
    }
}
