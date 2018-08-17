package PROV.DM;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author tassio
 */
public class ProvWasGeneratedBy implements Serializable {

    private String idWasGeneratedBy;
    private Date timeWasGeneratedBy;
    private ProvActivity activity;
    private PROV.DM.ProvEntity entity;

    public ProvWasGeneratedBy() {
    }

    public String getIdWasGeneratedBy() {
        return idWasGeneratedBy;
    }

    public void setIdWasGeneratedBy(String idWasGeneratedBy) {
        this.idWasGeneratedBy = idWasGeneratedBy;
    }

    public Date getTimeWasGeneratedBy() {
        return timeWasGeneratedBy;
    }

    public void setTimeWasGeneratedBy(Date timeWasGeneratedBy) {
        this.timeWasGeneratedBy = timeWasGeneratedBy;
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
        return "ProvWasGeneratedBy{" + "idWasGeneratedBy=" + idWasGeneratedBy + ", timeWasGeneratedBy=" + timeWasGeneratedBy + ", activity=" + activity + ", entity=" + entity + '}';
    }

}
