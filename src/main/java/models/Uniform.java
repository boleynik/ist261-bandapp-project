package models;

public class Uniform {
    private int memberID;
    private boolean hatdoesPass;
    private boolean jacketdoesPass;
    private boolean glovesdoesPass;
    private boolean pantsdoesPass;
    private boolean spatsdoesPass;
    private boolean shoesdoesPass;
    private boolean groomingdoesPass;

    public Uniform(){

    }

    public Uniform(int memberID, boolean hatdoesPass, boolean jacketdoesPass, boolean glovesdoesPass, boolean pantsdoesPass,
                   boolean spatsdoesPass, boolean shoesdoesPass, boolean groomingdoesPass) {
        this.memberID = memberID;
        this.hatdoesPass = hatdoesPass;
        this.jacketdoesPass = jacketdoesPass;
        this.glovesdoesPass = glovesdoesPass;
        this.pantsdoesPass = pantsdoesPass;
        this.spatsdoesPass = spatsdoesPass;
        this.shoesdoesPass = shoesdoesPass;
        this.groomingdoesPass = groomingdoesPass;
    }

    public boolean isHatdoesPass() {
        return hatdoesPass;
    }

    public void setHatdoesPass(boolean hatdoesPass) {
        this.hatdoesPass = hatdoesPass;
    }

    public boolean isJacketdoesPass() {
        return jacketdoesPass;
    }

    public void setJacketdoesPass(boolean jacketdoesPass) {
        this.jacketdoesPass = jacketdoesPass;
    }

    public boolean isGlovesdoesPass() {
        return glovesdoesPass;
    }

    public void setGlovesdoesPass(boolean glovesdoesPass) {
        this.glovesdoesPass = glovesdoesPass;
    }

    public boolean isPantsdoesPass() {
        return pantsdoesPass;
    }

    public void setPantsdoesPass(boolean pantsdoesPass) {
        this.pantsdoesPass = pantsdoesPass;
    }

    public boolean isSpatsdoesPass() {
        return spatsdoesPass;
    }

    public void setSpatsdoesPass(boolean spatsdoesPass) {
        this.spatsdoesPass = spatsdoesPass;
    }

    public boolean isShoesdoesPass() {
        return shoesdoesPass;
    }

    public void setShoesdoesPass(boolean shoesdoesPass) {
        this.shoesdoesPass = shoesdoesPass;
    }

    public boolean isGroomingdoesPass() {
        return groomingdoesPass;
    }

    public void setGroomingdoesPass(boolean groomingdoesPass) {
        this.groomingdoesPass = groomingdoesPass;
    }

    @Override
    public String toString() {
        return "models.Uniform{" +
                "hatdoesPass=" + hatdoesPass +
                ", jacketdoesPass=" + jacketdoesPass +
                ", glovesdoesPass=" + glovesdoesPass +
                ", pantsdoesPass=" + pantsdoesPass +
                ", spatsdoesPass=" + spatsdoesPass +
                ", shoesdoesPass=" + shoesdoesPass +
                ", groomingdoesPass=" + groomingdoesPass +
                '}';
    }

    public int getMemberID() {
        return memberID;
    }

    public void setMemberID(int memberID) {
        this.memberID = memberID;
    }
}

