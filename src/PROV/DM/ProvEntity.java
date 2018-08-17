package PROV.DM;

import java.io.Serializable;

/**
 *
 * @author tassio
 */
public class ProvEntity implements Serializable {

    private String idEntity;
    private String nameEntity;

    public String getIdEntity() {
        return idEntity;
    }

    public void setIdEntity(String idEntity) {
        this.idEntity = idEntity;
    }

    public String getNameEntity() {
        return nameEntity;
    }

    public void setNameEntity(String nameEntity) {
        this.nameEntity = nameEntity;
    }

    @Override
    public String toString() {
        return "ProvEntity{" + "idEntity=" + idEntity + ", nameEntity=" + nameEntity + '}';
    }

}
