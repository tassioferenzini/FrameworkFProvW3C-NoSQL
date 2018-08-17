package PROV.DM;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author tassio
 */
public class ProvWasStartedBy implements Serializable {

    private String idWasStartedBy;
    private Date time;
    private ProvActivity activity;
    private PROV.DM.ProvEntity entity;
    private PROV.DM.ProvEntity entity1;

    public ProvWasStartedBy() {
    }

    public String getIdWasStartedBy() {
        return idWasStartedBy;
    }

    public void setIdWasStartedBy(String idWasStartedBy) {
        this.idWasStartedBy = idWasStartedBy;
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

    public PROV.DM.ProvEntity getEntity1() {
        return entity1;
    }

    public void setEntity1(PROV.DM.ProvEntity entity1) {
        this.entity1 = entity1;
    }

    @Override
    public String toString() {
        return "ProvWasStartedBy{" + "idWasStartedBy=" + idWasStartedBy + ", time=" + time + ", activity=" + activity + ", entity=" + entity + ", entity1=" + entity1 + '}';
    }

}
