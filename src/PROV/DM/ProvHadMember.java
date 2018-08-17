package PROV.DM;

import java.io.Serializable;

/**
 *
 * @author tassio
 */
public class ProvHadMember implements Serializable {

    private String idHadMember;
    private String collection;
    private PROV.DM.ProvEntity entity;

    public ProvHadMember() {
    }

    public String getIdHadMember() {
        return idHadMember;
    }

    public void setIdHadMember(String idHadMember) {
        this.idHadMember = idHadMember;
    }

    public String getCollection() {
        return collection;
    }

    public void setCollection(String collection) {
        this.collection = collection;
    }

    public PROV.DM.ProvEntity getEntity() {
        return entity;
    }

    public void setEntity(PROV.DM.ProvEntity entity) {
        this.entity = entity;
    }

    @Override
    public String toString() {
        return "ProvHadMember{" + "idHadMember=" + idHadMember + ", collection=" + collection + ", entity=" + entity + '}';
    }

}
