package models;

public class Member {
    protected int memberID;
    protected String firstName;
    protected String lastName;
    protected int yearInBand;
    protected boolean isSectionLeader;
    protected double score;
    protected int uniform;

    public Member(int memberID, String firstName, String lastName, int yearInBand,
                  boolean isSectionLeader, int uniform, double score) {
        this.memberID = memberID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearInBand = yearInBand;
        this.isSectionLeader = isSectionLeader;
        this.score = score;
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

    public boolean isSectionLeader() {
        return isSectionLeader;
    }

    public void setSectionLeader(boolean sectionLeader) {
        isSectionLeader = sectionLeader;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
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
                ", isSectionLeader=" + isSectionLeader +
                ", score=" + score +
                ", uniform=" + uniform +
                '}';
    }
}

