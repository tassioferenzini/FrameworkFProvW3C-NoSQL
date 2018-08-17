package PROV.DM;

import java.io.Serializable;

/**
 *
 * @author tassio
 */
public class ProvWasInformedBy implements Serializable {

    private String idWasInformedBy;
    private ProvActivity activity;
    private ProvActivity activity1;

    public ProvWasInformedBy() {
    }

    public String getIdWasInformedBy() {
        return idWasInformedBy;
    }

    public void setIdWasInformedBy(String idWasInformedBy) {
        this.idWasInformedBy = idWasInformedBy;
    }

    public ProvActivity getActivity() {
        return activity;
    }

    public void setActivity(ProvActivity activity) {
        this.activity = activity;
    }

    public ProvActivity getActivity1() {
        return activity1;
    }

    public void setActivity1(ProvActivity activity1) {
        this.activity1 = activity1;
    }

    @Override
    public String toString() {
        return "ProvWasInformedBy{" + "idWasInformedBy=" + idWasInformedBy + ", activity=" + activity + ", activity1=" + activity1 + '}';
    }

}
