package PROV.DM;

import java.io.Serializable;

/**
 *
 * @author tassio
 */
public class ProvPrimarySource implements Serializable {

    private String idPrimarySource;
    private String type;
    private PROV.DM.ProvEntity entity;
    private PROV.DM.ProvEntity entity1;

    public ProvPrimarySource() {
    }

    public String getIdPrimarySource() {
        return idPrimarySource;
    }

    public void setIdPrimarySource(String idPrimarySource) {
        this.idPrimarySource = idPrimarySource;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
        return "ProvPrimarySource{" + "idPrimarySource=" + idPrimarySource + ", type=" + type + ", entity=" + entity + ", entity1=" + entity1 + '}';
    }

}
