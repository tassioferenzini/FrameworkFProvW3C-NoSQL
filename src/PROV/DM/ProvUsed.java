package PROV.DM;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author tassio
 */
public class ProvUsed implements Serializable {

    private String idUsed;
    private Date timeUsed;
    private ProvActivity activity;
    private PROV.DM.ProvEntity entity;

    public ProvUsed() {
    }

    public String getIdUsed() {
        return idUsed;
    }

    public void setIdUsed(String idUsed) {
        this.idUsed = idUsed;
    }

    public Date getTimeUsed() {
        return timeUsed;
    }

    public void setTimeUsed(Date timeUsed) {
        this.timeUsed = timeUsed;
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
        return "ProvUsed{" + "idUsed=" + idUsed + ", timeUsed=" + timeUsed + ", activity=" + activity + ", entity=" + entity + '}';
    }

}
