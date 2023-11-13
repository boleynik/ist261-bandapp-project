package models;

public class Bandfront extends Member {
    private int prop;

    public Bandfront(int studentID, String firstName, String lastName, int yearInBand,
                     boolean isSectionLeader, int uniform, double score, int prop) {
        super(studentID, firstName, lastName, yearInBand, isSectionLeader, uniform, score);
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
                ", isSectionLeader=" + isSectionLeader +
                ", uniform=" + uniform +
                ", score=" + score +
                ", prop=" + prop +
                '}';
    }
}
