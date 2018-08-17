package PROV.DM;

import java.io.Serializable;

/**
 *
 * @author tassio
 */
public class ProvWasAssociatedWith implements Serializable {

    private String idWasAssociatedWith;
    private String plan;
    private ProvActivity activity;
    private ProvAgent agent;

    public ProvWasAssociatedWith() {
    }

    public String getIdWasAssociatedWith() {
        return idWasAssociatedWith;
    }

    public void setIdWasAssociatedWith(String idWasAssociatedWith) {
        this.idWasAssociatedWith = idWasAssociatedWith;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
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
        return "ProvWasAssociatedWith{" + "idWasAssociatedWith=" + idWasAssociatedWith + ", plan=" + plan + ", activity=" + activity + ", agent=" + agent + '}';
    }

}
