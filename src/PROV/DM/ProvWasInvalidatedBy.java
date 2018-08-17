package PROV.DM;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author tassio
 */
public class ProvWasInvalidatedBy implements Serializable {

    private String idWasInvalidatedBy;
    private Date time;
    private ProvActivity activity;
    private PROV.DM.ProvEntity entity;

    public ProvWasInvalidatedBy() {
    }

    public String getIdWasInvalidatedBy() {
        return idWasInvalidatedBy;
    }

    public void setIdWasInvalidatedBy(String idWasInvalidatedBy) {
        this.idWasInvalidatedBy = idWasInvalidatedBy;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
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
        return "ProvWasInvalidatedBy{" + "idWasInvalidatedBy=" + idWasInvalidatedBy + ", time=" + time + ", activity=" + activity + ", entity=" + entity + '}';
    }

}
