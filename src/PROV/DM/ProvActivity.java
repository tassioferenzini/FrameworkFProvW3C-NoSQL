package PROV.DM;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author tassio
 */
public class ProvActivity implements Serializable {

    private String idActivity;
    private String nameActivity;
    private Date startTime;
    private Date endTime;

    public ProvActivity() {
    }

    public String getIdActivity() {
        return idActivity;
    }

    public void setIdActivity(String idActivity) {
        this.idActivity = idActivity;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getNameActivity() {
        return nameActivity;
    }

    public void setNameActivity(String nameActivity) {
        this.nameActivity = nameActivity;
    }

    @Override
    public String toString() {
        return "ProvActivity{" + "idActivity=" + idActivity + ", nameActivity=" + nameActivity + ", startTime=" + startTime + ", endTime=" + endTime + '}';
    }

}
