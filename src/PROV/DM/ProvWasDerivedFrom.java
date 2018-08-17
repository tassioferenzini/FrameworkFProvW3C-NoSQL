package PROV.DM;

import java.io.Serializable;

/**
 *
 * @author tassio
 */
public class ProvWasDerivedFrom implements Serializable {

    private String idwasDerivedFrom;
    private String generation;
    private String usage;
    private ProvActivity activity;
    private PROV.DM.ProvEntity generatedEntity;
    private PROV.DM.ProvEntity usedEntity;

    public ProvWasDerivedFrom() {
    }

    public String getIdwasDerivedFrom() {
        return idwasDerivedFrom;
    }

    public void setIdwasDerivedFrom(String idwasDerivedFrom) {
        this.idwasDerivedFrom = idwasDerivedFrom;
    }

    public String getGeneration() {
        return generation;
    }

    public void setGeneration(String generation) {
        this.generation = generation;
    }

    public String getUsage() {
        return usage;
    }

    public void setUsage(String usage) {
        this.usage = usage;
    }

    public ProvActivity getActivity() {
        return activity;
    }

    public void setActivity(ProvActivity activity) {
        this.activity = activity;
    }

    public ProvEntity getGeneratedEntity() {
        return generatedEntity;
    }

    public void setGeneratedEntity(ProvEntity generatedEntity) {
        this.generatedEntity = generatedEntity;
    }

    public ProvEntity getUsedEntity() {
        return usedEntity;
    }

    public void setUsedEntity(ProvEntity usedEntity) {
        this.usedEntity = usedEntity;
    }

    @Override
    public String toString() {
        return "ProvWasDerivedFrom{" + "idwasDerivedFrom=" + idwasDerivedFrom + ", generation=" + generation + ", usage=" + usage + ", activity=" + activity + ", generatedEntity=" + generatedEntity + ", usedEntity=" + usedEntity + '}';
    }

}
