package PROV.DM;

import java.io.Serializable;

/**
 *
 * @author tassio
 */
public class ProvWasAssociatedWithAE implements Serializable {

    private String idWasAssociatedWithAE;
    private ProvActivity activity;
    private PROV.DM.ProvEntity entity;

    public ProvWasAssociatedWithAE() {
    }

    public String getIdWasAssociatedWithAE() {
        return idWasAssociatedWithAE;
    }

    public void setIdWasAssociatedWithAE(String idWasAssociatedWithAE) {
        this.idWasAssociatedWithAE = idWasAssociatedWithAE;
    }

    public ProvActivity getActivity() {
        return activity;
    }

    public void setActivity(ProvActivity activity) {
        this.activity = activity;
    }

    public PROV.DM.ProvEntity getEntity() {
        return entity;
    }

    public void setEntity(PROV.DM.ProvEntity entity) {
        this.entity = entity;
    }

    @Override
    public String toString() {
        return "ProvWasAssociatedWithAE{" + "idWasAssociatedWithAE=" + idWasAssociatedWithAE + ", activity=" + activity + ", entity=" + entity + '}';
    }

}
