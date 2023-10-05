package models;

public class Prop {
    private String propType;
    private int propID;

    private int memberID;

    public Prop(){

    }

    public Prop(String propType, int propID, int memberID) {
        this.propType = propType;
        this.propID = propID;
        this.memberID = memberID;
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

    public int getMemberID() {
        return memberID;
    }

    public void setMemberID(int memberID) {
        this.memberID = memberID;
    }
}
