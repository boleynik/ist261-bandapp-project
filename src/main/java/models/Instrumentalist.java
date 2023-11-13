package models;

public class Instrumentalist extends Member{
    private int instrument;




    public Instrumentalist(int studentID, String firstName, String lastName, int yearInBand,
                           boolean isSectionLeader, int uniform, double score, int instrument) {
        super(studentID, firstName, lastName, yearInBand, isSectionLeader, uniform, score);
        this.instrument = instrument;
    }

    public Instrumentalist() {

    }

    public String getInstrument() {
        return String.valueOf(instrument);
    }

    public void setInstrument(int instrument) {
        this.instrument = instrument;
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
                ", instrument=" + instrument +
                '}';
    }
}
