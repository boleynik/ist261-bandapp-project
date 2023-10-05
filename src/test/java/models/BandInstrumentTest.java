package models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BandInstrumentTest {
BandInstrument inst = new BandInstrument("Mellophone", "Conn", 17, memberID);
    @Test
    void getType() {
        assertEquals("Mellophone", inst.getType());
    }

    @Test
    void setType() {
        inst.setType("Trumpet");
        assertEquals("Trumpet", inst.getType());
    }

    @Test
    void getInstrumentManufacturer() {
        assertEquals("Conn", inst.getInstrumentManufacturer());
    }

    @Test
    void setInstrumentManufacturer() {
        inst.setInstrumentManufacturer("Yamaha");
        assertEquals("Yamaha", inst.getInstrumentManufacturer());
    }

    @Test
    void getInstrumentSerialNumber() {
        assertEquals(17, inst.getInstrumentSerialNumber());
    }

    @Test
    void setInstrumentSerialNumber() {
        inst.setInstrumentSerialNumber(42);
        assertEquals(42, inst.getInstrumentSerialNumber());
    }

}