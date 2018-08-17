package PROV.DM;

import java.io.Serializable;

/**
 *
 * @author tassio
 */
public class ProvWasDerivedFromEA implements Serializable {

    private String idWasDerivedFromEA;
    private ProvActivity activity;
    private PROV.DM.ProvEntity entity;

    public ProvWasDerivedFromEA() {
    }

    public String getIdWasDerivedFromEA() {
        return idWasDerivedFromEA;
    }

    public void setIdWasDerivedFromEA(String idWasDerivedFromEA) {
        this.idWasDerivedFromEA = idWasDerivedFromEA;
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
        return "ProvWasDerivedFromEA{" + "idWasDerivedFromEA=" + idWasDerivedFromEA + ", activity=" + activity + ", entity=" + entity + '}';
    }

}
