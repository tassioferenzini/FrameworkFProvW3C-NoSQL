package PROV.DM;

import java.io.Serializable;

/**
 *
 * @author tassio
 */
public class ProvSpecializationOf implements Serializable {

    private String idSpecializationOf;
    private PROV.DM.ProvEntity entity;
    private PROV.DM.ProvEntity entity1;

    public ProvSpecializationOf() {
    }

    public String getIdSpecializationOf() {
        return idSpecializationOf;
    }

    public void setIdSpecializationOf(String idSpecializationOf) {
        this.idSpecializationOf = idSpecializationOf;
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
        return "ProvSpecializationOf{" + "idSpecializationOf=" + idSpecializationOf + ", entity=" + entity + ", entity1=" + entity1 + '}';
    }

}
