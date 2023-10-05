package models;

public class Bandfront extends Member {
    private Prop prop;

    public Bandfront(int studentID, String firstName, String lastName, int yearInBand, String rankAndFile,
                     boolean isSectionLeader, Uniform uniform, double uniformScore, double musicScore, Prop prop) {
        super(studentID, firstName, lastName, yearInBand, rankAndFile, isSectionLeader, uniform, uniformScore, musicScore);
        this.prop = prop;
    }

    public Prop getProp() {
        return prop;
    }

    public void setProp(Prop prop) {
        this.prop = prop;
    }

    @Override
    public String toString() {
        return "models.Member{" +
                "studentID=" + studentID +
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
