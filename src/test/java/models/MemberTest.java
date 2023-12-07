package models;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MemberTest {
    Uniform uniform = new Uniform(1, true, true,true,
            true,true,true,true);
    Member mem1 = new Member(001, "Sam", "Band", 4,
            false, 1, 100);
    @org.junit.jupiter.api.Test
    void getStudentID() {

        assertEquals(001, mem1.getMemberID());
    }

    @org.junit.jupiter.api.Test
    void setStudentID() {
        mem1.setMemberID(002);
        assertEquals(002, mem1.getMemberID());
    }

    @org.junit.jupiter.api.Test
    void getFirstName() {
        assertEquals("Sam", mem1.getFirstName());
    }

    @org.junit.jupiter.api.Test
    void setFirstName() {
        mem1.setFirstName("Hannah");
        assertEquals("Hannah", mem1.getFirstName());
    }

    @org.junit.jupiter.api.Test
    void getLastName() {
        assertEquals("Band", mem1.getLastName());
    }

    @org.junit.jupiter.api.Test
    void setLastName() {
        mem1.setLastName("March");
        assertEquals("March", mem1.getLastName());
    }

    @org.junit.jupiter.api.Test
    void getYearInBand() {
        assertEquals(4, mem1.getYearInBand());
    }

    @org.junit.jupiter.api.Test
    void setYearInBand() {
        mem1.setYearInBand(3);
        assertEquals(3, mem1.getYearInBand());
    }


    @org.junit.jupiter.api.Test
    void isSectionLeader() {
        assertEquals(false, mem1.isSectionLeader());
    }

    @org.junit.jupiter.api.Test
    void setSectionLeader() {
        mem1.setSectionLeader(true);
        assertEquals(true, mem1.isSectionLeader());
    }

    @org.junit.jupiter.api.Test
    void getUniform() {
        assertEquals(uniform, mem1.getUniform());

    }
}