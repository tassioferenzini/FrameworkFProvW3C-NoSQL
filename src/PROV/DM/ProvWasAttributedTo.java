package PROV.DM;

import java.io.Serializable;

/**
 *
 * @author tassio
 */
public class ProvWasAttributedTo implements Serializable {

    private String idWasAttributedTo;
    private ProvAgent agent;
    private PROV.DM.ProvEntity entity;

    public ProvWasAttributedTo() {
    }

    public String getIdWasAttributedTo() {
        return idWasAttributedTo;
    }

    public void setIdWasAttributedTo(String idWasAttributedTo) {
        this.idWasAttributedTo = idWasAttributedTo;
    }
    
    public ProvAgent getAgent() {
        return agent;
    }

    public void setAgent(ProvAgent agent) {
        this.agent = agent;
    }

    public PROV.DM.ProvEntity getEntity() {
        return entity;
    }

    public void setEntity(PROV.DM.ProvEntity entity) {
        this.entity = entity;
    }

    @Override
    public String toString() {
        return "ProvWasAttributedTo{" + "idWasAttributedTo=" + idWasAttributedTo + ", agent=" + agent + ", entity=" + entity + '}';
    }

}
