package PROV.DM;

import java.io.Serializable;

/**
 *
 * @author tassio
 */
public class ProvAgent implements Serializable {

    private String idAgent;
    private String typeAgent;
    private String nameAgent;

    public ProvAgent() {
    }

    public String getTypeAgent() {
        return typeAgent;
    }

    public void setTypeAgent(String typeAgent) {
        this.typeAgent = typeAgent;
    }

    public String getNameAgent() {
        return nameAgent;
    }

    public void setNameAgent(String nameAgent) {
        this.nameAgent = nameAgent;
    }

    @Override
    public String toString() {
        return "ProvAgent{" + "idAgent=" + idAgent + ", typeAgent=" + typeAgent + ", nameAgent=" + nameAgent + '}';
    }

}
