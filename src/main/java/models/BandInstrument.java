package models;

public class BandInstrument {
    private String instrumentType;
    private String instrumentManufacturer;
    private int instrumentSerialNumber;

    public BandInstrument(String instrumentType, String instrumentManufacturer, int instrumentSerialNumber) {
        this.instrumentType = instrumentType;
        this.instrumentManufacturer = instrumentManufacturer;
        this.instrumentSerialNumber = instrumentSerialNumber;
    }

    public String getType() {
        return instrumentType;
    }

    public void setType(String type) {
        this.instrumentType = type;
    }

    public String getInstrumentManufacturer() {
        return instrumentManufacturer;
    }

    public void setInstrumentManufacturer(String instrumentManufacturer) {
        this.instrumentManufacturer = instrumentManufacturer;
    }

    public int getInstrumentSerialNumber() {
        return instrumentSerialNumber;
    }

    public void setInstrumentSerialNumber(int instrumentSerialNumber) {
        this.instrumentSerialNumber = instrumentSerialNumber;
    }

    @Override
    public String toString() {
        return "Instrument{" +
                "instrumentType='" + instrumentType + '\'' +
                ", instrumentManufacturer='" + instrumentManufacturer + '\'' +
                ", instrumentSerialNumber=" + instrumentSerialNumber +
                '}';
    }
}
