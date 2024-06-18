package beans.lifecycle;

import javax.faces.event.*;
import org.apache.logging.log4j.*;

public class DebuggerListener implements javax.faces.event.PhaseListener {

    Logger log = LogManager.getRootLogger();

    @Override
    public void beforePhase(PhaseEvent pe) {
        if (log.isInfoEnabled()) {
            log.info("Antes de la fase" + pe.getPhaseId().toString());
        }
    }

    @Override
    public void afterPhase(PhaseEvent pe) {
        if (log.isInfoEnabled()) {
            log.info("Despues de la fase" + pe.getPhaseId().toString());
        }
    }

    @Override
    public PhaseId getPhaseId() {
        return PhaseId.ANY_PHASE;
    }

}
