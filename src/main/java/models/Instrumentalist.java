package models;

public class Instrumentalist extends Member{
    private int instrument;




    public Instrumentalist(int studentID, String firstName, String lastName, int yearInBand, String rankAndFile,
                           boolean isSectionLeader, int uniform, double uniformScore, double musicScore, int instrument) {
        super(studentID, firstName, lastName, yearInBand, rankAndFile, isSectionLeader, uniform, uniformScore, musicScore);
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
                ", rankAndFile='" + rankAndFile + '\'' +
                ", isSectionLeader=" + isSectionLeader +
                ", uniform=" + uniform +
                ", uniformScore=" + uniformScore +
                ", musicScore=" + musicScore +
                ", instrument=" + instrument +
                '}';
    }
}
