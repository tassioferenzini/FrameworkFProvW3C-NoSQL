package PROV.DM;

import java.io.Serializable;

/**
 *
 * @author tassio
 */
public class ProvAlternateOf implements Serializable {

    private String idAlterneteOf;
    private PROV.DM.ProvEntity entity;
    private PROV.DM.ProvEntity entity1;

    public ProvAlternateOf() {
    }

    public PROV.DM.ProvEntity getEntity() {
        return entity;
    }

    public void setEntity(PROV.DM.ProvEntity entity) {
        this.entity = entity;
    }

    public PROV.DM.ProvEntity getEntity1() {
        return entity1;
    }

    public void setEntity1(PROV.DM.ProvEntity entity1) {
        this.entity1 = entity1;
    }

    @Override
    public String toString() {
        return "ProvAlternateOf{" + "idAlterneteOf=" + idAlterneteOf + ", entity=" + entity + ", entity1=" + entity1 + '}';
    }

}
