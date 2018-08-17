package PROV.DM;

import java.io.Serializable;

/**
 *
 * @author tassio
 */
public class ProvQuotation implements Serializable {

    private String idQuotation;
    private PROV.DM.ProvEntity entity;
    private PROV.DM.ProvEntity entity1;

    public ProvQuotation() {
    }

    public String getIdQuotation() {
        return idQuotation;
    }

    public void setIdQuotation(String idQuotation) {
        this.idQuotation = idQuotation;
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
        return "ProvQuotation{" + "idQuotation=" + idQuotation + ", entity=" + entity + ", entity1=" + entity1 + '}';
    }

}
