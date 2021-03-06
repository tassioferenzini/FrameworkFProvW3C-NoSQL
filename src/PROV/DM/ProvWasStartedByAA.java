package PROV.DM;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author tassio
 */
public class ProvWasStartedByAA implements Serializable {

    private String idWasStartedBy;
    private Date time;
    private ProvActivity activity;
    private ProvActivity activity1;
    private PROV.DM.ProvEntity entity;

    public ProvWasStartedByAA() {
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

    public ProvActivity getActivity1() {
        return activity1;
    }

    public void setActivity1(ProvActivity activity1) {
        this.activity1 = activity1;
    }

    public PROV.DM.ProvEntity getEntity() {
        return entity;
    }

    public void setEntity(PROV.DM.ProvEntity entity) {
        this.entity = entity;
    }

    @Override
    public String toString() {
        return "ProvWasStartedByAA{" + "idWasStartedBy=" + idWasStartedBy + ", time=" + time + ", activity=" + activity + ", activity1=" + activity1 + ", entity=" + entity + '}';
    }

}
