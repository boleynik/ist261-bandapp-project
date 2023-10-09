import models.BandInstrument;
import models.DataEngine;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        TestHarness th = new TestHarness();
        th.testDirector();
        System.out.println();
        th.testUniform();


        DataEngine de = new DataEngine();
        ArrayList<BandInstrument> inst = de.loadInstrumentData("instrument.csv");
        System.out.println();

    }
}
/*
my junit tests are found in the "test" directory.
 */