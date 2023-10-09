package controllers;

import models.BandInstrument;


import java.util.ArrayList;


public class HomeController {


    // TODO: 10/5/23 make home ui and initialize

    // TODO: HomeUI.setLocationRelative(null); how to make app centered on screen



    public ArrayList<BandInstrument> getBandInstrument(int memberID){
        ArrayList<BandInstrument> instruments = new ArrayList<BandInstrument>();

            BandInstrument bInstrument = new BandInstrument();
            bInstrument.setMemberID(memberID);
            bInstrument.setType("Mellophone");
            bInstrument.setInstrumentManufacturer("Conn");
            bInstrument.setInstrumentSerialNumber(1);

            instruments.add(bInstrument);

            BandInstrument bInstrument2 = new BandInstrument();
            bInstrument2.setMemberID(memberID);
            bInstrument2.setType("Mellophone");
            bInstrument2.setInstrumentManufacturer("Conn");
            bInstrument2.setInstrumentSerialNumber(2);

            instruments.add(bInstrument2);

            BandInstrument bInstrument3 = new BandInstrument();
            bInstrument3.setMemberID(memberID);
            bInstrument3.setType("Mellophone");
            bInstrument3.setInstrumentManufacturer("Conn");
            bInstrument3.setInstrumentSerialNumber(3);

            instruments.add(bInstrument3);


    }
}
