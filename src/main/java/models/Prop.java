package models;

public class Prop {
    private String propType;
    private int propID;

    public Prop(String propType, int propID) {
        this.propType = propType;
        this.propID = propID;
    }

    public String getPropType() {
        return propType;
    }

    public void setPropType(String propType) {
        this.propType = propType;
    }

    public int getPropID() {
        return propID;
    }

    public void setPropID(int propID) {
        this.propID = propID;
    }

    @Override
    public String toString() {
        return "models.Prop{" +
                "propType='" + propType + '\'' +
                ", propID=" + propID +
                '}';
    }
}
