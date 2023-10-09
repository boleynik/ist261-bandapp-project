package models;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class DataEngine {
    public ArrayList<BandInstrument> loadInstrumentData(String fileName){
        ArrayList<BandInstrument>  instruments = new ArrayList<BandInstrument>();
        try {
            File data = new File(fileName);
            Scanner input = new Scanner(data);
            input.useDelimiter(",");
            //since the data file has headers in the first line we need to skip reading in the first line
            input.nextLine();
            //now start looping thru and loading the models
            int q = 1;
            while (input.hasNextLine())
            {
                BandInstrument newInstrument = new BandInstrument();
                String[] record = input.nextLine().split(",");
                BandInstrument.setMemberID(q);
                q++;
                for(int x = 0; x < record.length-1; x++)
                {
                    newInstrument.setType(record[0]);
                    newInstrument.setInstrumentManufacturer(record[1]);
                    newInstrument.setInstrumentSerialNumber(Integer.parseInt(record[2]));
                    //need to convert string to int
                    newInstrument.setInstrumentSerialNumber(Integer.parseInt(record[3]));
                }
                instruments.add(newInstrument);
            }
        }
        catch(IOException ex)
        {
            System.out.println(ex.getMessage());
        }
        return instruments;
    }
    public ArrayList<Prop> loadPropData(String fileName){
        ArrayList<Prop>  props = new ArrayList<Prop>();
        try {
            File data = new File(fileName);
            Scanner input = new Scanner(data);
            input.useDelimiter(",");
            //since the data file has headers in the first line we need to skip reading in the first line
            input.nextLine();
            //now start looping thru and loading the models
            int q = 1;
            while (input.hasNextLine())
            {
                Prop newProp = new Prop();
                String[] record = input.nextLine().split(",");
                Prop.setMemberID(q);
                q++;
                for(int x = 0; x < record.length-1; x++)
                {
                    newProp.setPropType(record[0]);
                    newProp.setPropID(Integer.parseInt(record[1]));
                }
                props.add(newProp);
            }
        }
        catch(IOException ex)
        {
            System.out.println(ex.getMessage());
        }
        return props;
    }
    public ArrayList<Member> loadMemberData(String fileName){
        ArrayList<Member>  members = new ArrayList<Member>();
        try {
            File data = new File(fileName);
            Scanner input = new Scanner(data);
            input.useDelimiter(",");
            //since the data file has headers in the first line we need to skip reading in the first line
            input.nextLine();
            //now start looping thru and loading the models
            int q = 1;
            while (input.hasNextLine())
            {
                BandInstrument newInstrument = new BandInstrument();
                String[] record = input.nextLine().split(",");
                BandInstrument.setMemberID(q);
                q++;
                for(int x = 0; x < record.length-1; x++)
                {
                    newInstrument.setType(record[0]);
                    newInstrument.setInstrumentManufacturer(record[1]);
                    newInstrument.setInstrumentSerialNumber(Integer.parseInt(record[2]));
                    //need to convert string to int
                    newInstrument.setInstrumentSerialNumber(Integer.parseInt(record[3]));
                }
                instruments.add(newInstrument);
            }
        }
        catch(IOException ex)
        {
            System.out.println(ex.getMessage());
        }
        return instruments;
    }

}