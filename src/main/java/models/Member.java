package models;

public class Member {
    protected int memberID;
    protected String firstName;
    protected String lastName;
    protected int yearInBand;
    protected String rankAndFile;
    protected boolean isSectionLeader;
    protected double uniformScore;
    protected double musicScore;
    protected int uniform;

    public Member(int memberID, String firstName, String lastName, int yearInBand,
                  String rankAndFile, boolean isSectionLeader, int uniform, double uniformScore, double musicScore) {
        this.memberID = memberID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearInBand = yearInBand;
        this.rankAndFile = rankAndFile;
        this.isSectionLeader = isSectionLeader;
        this.uniformScore = uniformScore;
        this.musicScore = musicScore;
        this.uniform = uniform;
    }

    public Member() {
    }

    public int getMemberID() {
        return memberID;
    }

    public void setMemberID(int memberID) {
        this.memberID = memberID;
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

    public int getUniform() {
        return uniform;
    }

    public void setUniform(int uniformID) {
        this.uniform = uniform;
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
                ", uniformScore=" + uniformScore +
                ", musicScore=" + musicScore +
                ", uniform=" + uniform +
                '}';
    }
}

