package PROV.DM;

import java.io.Serializable;

/**
 *
 * @author tassio
 */
public class ProvActedOnBehalfOf implements Serializable {

    private String idActedOnBehalfOf;
    private ProvActivity activity;
    private ProvAgent agent;
    private ProvAgent agent1;

    public ProvActedOnBehalfOf() {
    }

    public String getIdActedOnBehalfOf() {
        return idActedOnBehalfOf;
    }

    public void setIdActedOnBehalfOf(String idActedOnBehalfOf) {
        this.idActedOnBehalfOf = idActedOnBehalfOf;
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

    public ProvAgent getAgent1() {
        return agent1;
    }

    public void setAgent1(ProvAgent agent1) {
        this.agent1 = agent1;
    }

    @Override
    public String toString() {
        return "ProvActedOnBehalfOf{" + "idActedOnBehalfOf=" + idActedOnBehalfOf + ", activity=" + activity + ", agent=" + agent + ", agent1=" + agent1 + '}';
    }

}
