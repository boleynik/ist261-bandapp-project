package models;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class DataEngine {
    public ArrayList<BandInstrument> loadInstrumentData(String fileName){
        ArrayList<BandInstrument>  instruments = new ArrayList<>();
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
                q++;
                for(int x = 0; x < record.length-1; x++)
                {

                    newInstrument.setType(record[0]);
                    newInstrument.setInstrumentManufacturer(record[1]);
                    newInstrument.setInstrumentSerialNumber(Integer.parseInt(record[2]));
                    //need to convert string to int
                    newInstrument.setMemberID(Integer.parseInt(record[3]));
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
        ArrayList<Prop>  props = new ArrayList<>();
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

                q++;
                for(int x = 0; x < record.length-1; x++)
                {
                    newProp.setPropType(record[0]);
                    newProp.setPropID(Integer.parseInt(record[1]));
                    newProp.setMemberID(Integer.parseInt(record[2]));
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
    public ArrayList<Uniform> loadUniformData(String fileName){
        ArrayList<Uniform>  uniforms = new ArrayList<>();
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
                Uniform newUniform = new Uniform();
                String[] record = input.nextLine().split(",");
                q++;
                for(int x = 0; x < record.length-1; x++)
                {
                    newUniform.setMemberID(Integer.parseInt(record[0]));
                    newUniform.setHatdoesPass(Boolean.parseBoolean(record[1]));
                    newUniform.setJacketdoesPass(Boolean.parseBoolean(record[2]));
                    newUniform.setGlovesdoesPass(Boolean.parseBoolean(record[3]));
                    newUniform.setPantsdoesPass(Boolean.parseBoolean(record[4]));
                    newUniform.setSpatsdoesPass(Boolean.parseBoolean(record[5]));
                    newUniform.setShoesdoesPass(Boolean.parseBoolean(record[6]));
                    newUniform.setGroomingdoesPass(Boolean.parseBoolean(record[7]));
                }
                uniforms.add(newUniform);
            }
        }
        catch(IOException ex)
        {
            System.out.println(ex.getMessage());
        }
        return uniforms;
    }
    public ArrayList<Member> loadMemberData(String fileName){
        ArrayList<Member>  members = new ArrayList<>();
        try {
            File data = new File(fileName);
            Scanner input = new Scanner(data);
            input.useDelimiter(",");
            //since the data file has headers in the first line we need to skip reading in the first line
            input.nextLine();
            //now start looping thru and loading the models
            int q = 1;
            while (input.hasNextLine()) {

//                BandInstrument newInstrument = new BandInstrument();
                String[] record = input.nextLine().split(",");
//                BandInstrument.setMemberID(q);
                q++;
                if (Objects.equals(record[0], "Instrumentalist")) {
                    Instrumentalist newInstrumentalist = new Instrumentalist();
                    for (int x = 0; x < record.length - 1; x++) {
                        newInstrumentalist.setMemberID(Integer.parseInt(record[1]));
                        newInstrumentalist.setFirstName(record[2]);
                        newInstrumentalist.setLastName(record[3]);
                        newInstrumentalist.setYearInBand(Integer.parseInt(record[4]));
                        newInstrumentalist.setRankAndFile(record[5]);
                        newInstrumentalist.setSectionLeader(Boolean.parseBoolean(record[6]));
                        newInstrumentalist.setUniformScore(Double.parseDouble(record[7]));
                        newInstrumentalist.setMusicScore(Double.parseDouble(record[8]));
                        newInstrumentalist.setUniform(Integer.parseInt(record[9]));
                        newInstrumentalist.setInstrument(Integer.parseInt(record[10]));
                    }
                    members.add(newInstrumentalist);
                } else {
                    Bandfront newBandfront = new Bandfront();
                    for (int x = 0; x < record.length - 1; x++) {
                        newBandfront.setMemberID(Integer.parseInt(record[1]));
                        newBandfront.setFirstName(record[2]);
                        newBandfront.setLastName(record[3]);
                        newBandfront.setYearInBand(Integer.parseInt(record[4]));
                        newBandfront.setRankAndFile(record[5]);
                        newBandfront.setSectionLeader(Boolean.parseBoolean(record[6]));
                        newBandfront.setUniformScore(Double.parseDouble(record[7]));
                        newBandfront.setMusicScore(Double.parseDouble(record[8]));
                        newBandfront.setUniform(Integer.parseInt(record[9]));
                        newBandfront.setProp(Integer.parseInt(record[10]));

                    }
                    members.add(newBandfront);
                }
            }
        }
        catch(IOException ex)
        {
            System.out.println(ex.getMessage());
        }
        return members;
    }

}