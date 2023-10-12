package models;

public class Bandfront extends Member {
    private int prop;

    public Bandfront(int studentID, String firstName, String lastName, int yearInBand, String rankAndFile,
                     boolean isSectionLeader, int uniform, double uniformScore, double musicScore, int prop) {
        super(studentID, firstName, lastName, yearInBand, rankAndFile, isSectionLeader, uniform, uniformScore, musicScore);
        this.prop = prop;
    }
    public Bandfront(){

    }

    public int getProp() {
        return prop;
    }

    public void setProp(int prop) {
        this.prop = prop;
    }

    @Override
    public String toString() {
        return "models.Member{" +
                "memberID=" + memberID +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", yearInBand=" + yearInBand +
                ", rankAndFile='" + rankAndFile + '\'' +
                ", isSectionLeader=" + isSectionLeader +
                ", uniform=" + uniform +
                ", uniformScore=" + uniformScore +
                ", musicScore=" + musicScore +
                ", prop=" + prop +
                '}';
    }
}
