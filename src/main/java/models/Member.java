package models;

public class Member {
    protected int studentID;
    protected String firstName;
    protected String lastName;
    protected int yearInBand;
    protected String rankAndFile;
    protected boolean isSectionLeader;
    protected double uniformScore;
    protected double musicScore;
    protected Uniform uniform;

    public Member(int studentID, String firstName, String lastName, int yearInBand,
                  String rankAndFile, boolean isSectionLeader,Uniform uniform, double uniformScore, double musicScore) {
        this.studentID = studentID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearInBand = yearInBand;
        this.rankAndFile = rankAndFile;
        this.isSectionLeader = isSectionLeader;
        this.uniformScore = uniformScore;
        this.musicScore = musicScore;
        this.uniform = uniform;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYearInBand() {
        return yearInBand;
    }

    public void setYearInBand(int yearInBand) {
        this.yearInBand = yearInBand;
    }

    public String getRankAndFile() {
        return rankAndFile;
    }

    public void setRankAndFile(String rankAndFile) {
        this.rankAndFile = rankAndFile;
    }

    public boolean isSectionLeader() {
        return isSectionLeader;
    }

    public void setSectionLeader(boolean sectionLeader) {
        isSectionLeader = sectionLeader;
    }

    public double getUniformScore() {
        return uniformScore;
    }

    public void setUniformScore(double uniformScore) {
        this.uniformScore = uniformScore;
    }

    public double getMusicScore() {
        return musicScore;
    }

    public void setMusicScore(double musicScore) {
        this.musicScore = musicScore;
    }

    public Uniform getUniform() {
        return uniform;
    }

    public void setUniform(Uniform uniform) {
        this.uniform = uniform;
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
                ", uniformScore=" + uniformScore +
                ", musicScore=" + musicScore +
                ", uniform=" + uniform +
                '}';
    }
}

