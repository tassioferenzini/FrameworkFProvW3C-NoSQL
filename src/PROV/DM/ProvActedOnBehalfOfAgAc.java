package PROV.DM;

import java.io.Serializable;

/**
 *
 * @author tassio
 */
public class ProvActedOnBehalfOfAgAc implements Serializable {

    private String idActedOnBehalfOfAgAc;
    private ProvActivity activity;
    private ProvAgent agent;

    public ProvActedOnBehalfOfAgAc() {
    }

    public String getIdActedOnBehalfOfAgAc() {
        return idActedOnBehalfOfAgAc;
    }

    public void setIdActedOnBehalfOfAgAc(String idActedOnBehalfOfAgAc) {
        this.idActedOnBehalfOfAgAc = idActedOnBehalfOfAgAc;
    }

    public ProvActivity getActivity() {
        return activity;
    }

    public void setActivity(ProvActivity activity) {
        this.activity = activity;
    }

    public ProvAgent getAgent() {
        return agent;
    }

    public void setAgent(ProvAgent agent) {
        this.agent = agent;
    }

    @Override
    public String toString() {
        return "ProvActedOnBehalfOfAgAc{" + "idActedOnBehalfOfAgAc=" + idActedOnBehalfOfAgAc + ", activity=" + activity + ", agent=" + agent + '}';
    }

}
