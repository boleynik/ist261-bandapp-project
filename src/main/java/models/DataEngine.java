package models;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
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
            while (input.hasNextLine())
            {
                BandInstrument newInstrument = new BandInstrument();
                String[] record = input.nextLine().split(",");
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
            while (input.hasNextLine())
            {
                Prop newProp = new Prop();
                String[] record = input.nextLine().split(",");

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
            while (input.hasNextLine())
            {
                Uniform newUniform = new Uniform();
                String[] record = input.nextLine().split(",");
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
            while (input.hasNextLine()) {

                String[] record = input.nextLine().split(",");

                if (Objects.equals(record[0], "Instrumentalist")) {
                    Instrumentalist newInstrumentalist = new Instrumentalist();
                    for (int x = 0; x < record.length - 1; x++) {
                        newInstrumentalist.setMemberID(Integer.parseInt(record[1]));
                        newInstrumentalist.setFirstName(record[2]);
                        newInstrumentalist.setLastName(record[3]);
                        newInstrumentalist.setYearInBand(Integer.parseInt(record[4]));
                        newInstrumentalist.setSectionLeader(Boolean.parseBoolean(record[5]));
                        newInstrumentalist.setScore(Double.parseDouble(record[6]));
                        newInstrumentalist.setUniform(Integer.parseInt(record[7]));
                        newInstrumentalist.setInstrument(Integer.parseInt(record[8]));
                    }
                    members.add(newInstrumentalist);
                } else {
                    Bandfront newBandfront = new Bandfront();
                    for (int x = 0; x < record.length - 1; x++) {
                        newBandfront.setMemberID(Integer.parseInt(record[1]));
                        newBandfront.setFirstName(record[2]);
                        newBandfront.setLastName(record[3]);
                        newBandfront.setYearInBand(Integer.parseInt(record[4]));
                        newBandfront.setSectionLeader(Boolean.parseBoolean(record[5]));
                        newBandfront.setScore(Double.parseDouble(record[6]));
                        newBandfront.setUniform(Integer.parseInt(record[7]));
                        newBandfront.setProp(Integer.parseInt(record[8]));

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
    public boolean saveData(ArrayList<Member> members, String fileName){
        try {
            File data = new File(fileName);
            Scanner input = new Scanner(data);
            input.useDelimiter(",");

            BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
            bw.write("Member,Member ID,First name,Last name,Year in band,Section Leader,Score,Uniform,Instrument/Prop");
            for (Member member : members){
                if (member instanceof Instrumentalist){
                    String dataToWrite = "Instrumentalist," + member.getMemberID() + "," + member.getFirstName() + "," +
                            member.getLastName() + "," + member.getYearInBand()
                            + "," + member.isSectionLeader()
                            + "," + member.getScore() + "," + member.getUniform()
                            + "," + ((Instrumentalist) member).getInstrument();
                    input.close();
                    bw.write("\n" + dataToWrite);
                } else if (member instanceof Bandfront) {
                    String dataToWrite = "Bandfront," + member.getMemberID() + "," + member.getFirstName() + "," +
                            member.getLastName() + "," + member.getYearInBand()
                            + "," + member.isSectionLeader()
                            + "," + member.getScore()
                            + "," + member.getUniform() + "," + ((Bandfront) member).getProp();
                    input.close();
                    bw.write("\n" + dataToWrite);
                } else {

                }
            }

            bw.close();

        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
            return false;
        }
        return true;
    }


    //NOT CURRENTLY BEING USED BECAUSE I HAVEN'T ALLOWED USERS TO MANIPULATE/ACCESS THIS DATA YET
    public boolean saveInstrumentData(ArrayList <BandInstrument> instruments,String fileName){
        try {
            File data = new File(fileName);
            Scanner input = new Scanner(data);
            input.useDelimiter(",");

            BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
            bw.write("Type,Manufacturer,Serial Number,MemberID");
            for (BandInstrument instrument : instruments) {
                String dataToWrite = instrument.getType() + "," + instrument.getInstrumentManufacturer() + "," +
                        instrument.getInstrumentSerialNumber() + "," + instrument.getMemberID();
                bw.write("\n" + dataToWrite);
            }
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
            return false;
        }
        return true;
    }
    //NOT CURRENTLY BEING USED BECAUSE I HAVEN'T ALLOWED USERS TO MANIPULATE/ACCESS THIS DATA YET
    public boolean savePropData(ArrayList<Prop> props, String fileName){
        try {
            File data = new File(fileName);
            Scanner input = new Scanner(data);
            input.useDelimiter(",");

            BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
            bw.write("Type,ID,MemberID");
            for (Prop prop : props) {
                String dataToWrite = prop.getPropType() + "," + prop.getPropID() + "," +
                        prop.getMemberID();
                bw.write("\n" + dataToWrite);
            }
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
            return false;
        }
        return true;
    }
    //NOT CURRENTLY BEING USED BECAUSE I HAVEN'T ALLOWED USERS TO MANIPULATE/ACCESS THIS DATA YET
    public boolean saveUniformData(ArrayList<Uniform> uniforms, String fileName){
        try {
            File data = new File(fileName);
            Scanner input = new Scanner(data);
            input.useDelimiter(",");

            BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
            bw.write("MemberID,Hat,Jacket,Gloves,Pants,Spats,Shoes,Grooming");
            for (Uniform uniform : uniforms) {
                String dataToWrite = uniform.getMemberID() + "," + uniform.isHatdoesPass() + "," +
                        uniform.isJacketdoesPass() + "," + uniform.isGlovesdoesPass() + "," +
                        uniform.isPantsdoesPass() + "," + uniform.isSpatsdoesPass() + "," +
                        uniform.isShoesdoesPass() + "," + uniform.isGroomingdoesPass();
                        bw.write("\n" + dataToWrite);
            }
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
            return false;
        }
        return true;
    }
}