package models;

public class Instrumentalist extends Member{
    private BandInstrument instrument;


    public Instrumentalist(int studentID, String firstName, String lastName, int yearInBand, String rankAndFile,
                           boolean isSectionLeader, Uniform uniform, double uniformScore, double musicScore, BandInstrument instrument) {
        super(studentID, firstName, lastName, yearInBand, rankAndFile, isSectionLeader, uniform, uniformScore, musicScore);
        this.instrument = instrument;
    }

    public String getInstrument() {
        return String.valueOf(instrument);
    }

    public void setInstrument(BandInstrument instrument) {
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
