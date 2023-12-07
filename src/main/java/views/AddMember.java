package views;

import controllers.HomeController;
import models.Bandfront;
import models.Instrumentalist;
import models.Member;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddMember extends JFrame{
    private JPanel panel1;
    private JTextField firstNameField;
    private JTextField lastNameField;
    private JTextField YIBField;
    private JButton saveButton;
    private JButton exitButton;
    private JButton deleteButton;
    private JRadioButton instrumentalistRadioButton;
    private JRadioButton bandfrontRadioButton;
    private JRadioButton yesRadioButton;
    private JRadioButton noRadioButton;
    private JTextField scoreField;
    private HomeController homeController;
    private HomeUI callingF;
    private int memberID;
    private AddMember thisForm;
    private ButtonGroup groupForBFI;
    private ButtonGroup groupForSL;


    /*
    ************
    CONSTRUCTORS
    ************
     */
    public AddMember(HomeController homeControllerpPassedIn, HomeUI callingForm){

        homeController = homeControllerpPassedIn;
        callingF = callingForm;
        thisForm = this;
        this.setSize(800, 250);
        setContentPane(panel1);
        setLocationRelativeTo(null);
        groupForBFI = new ButtonGroup();
        groupForBFI.add(instrumentalistRadioButton);
        groupForBFI.add(bandfrontRadioButton);
        groupForSL = new ButtonGroup();
        groupForSL.add(yesRadioButton);
        groupForSL.add(noRadioButton);

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                thisForm.dispose();
            }
        });
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteMember();
                callingF.loadTable(homeController.members);
                thisForm.dispose();
            }
        });

        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (memberID == 0){
                    addNewMember();
                }else {
                    editMember();
                }
                callingF.loadTable(homeController.members);

                thisForm.dispose();
            }
        });

    }
    public AddMember(int memberID, String firstName, String lastName,
                     int yearInBand, HomeUI callingFormIn, HomeController controllerIn){
        firstNameField.setText(firstName);
        lastNameField.setText(lastName);
        YIBField.setText(String.valueOf(yearInBand));
        this.memberID = memberID;
        callingF = callingFormIn;
        homeController = controllerIn;
        thisForm = this;
        groupForSL = new ButtonGroup();
        groupForSL.add(instrumentalistRadioButton);
        groupForSL.add(bandfrontRadioButton);

        this.setSize(800, 250);
        setContentPane(panel1);
        setLocationRelativeTo(null);

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                thisForm.dispose();
            }
        });
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteMember();
                callingF.loadTable(homeController.members);
                thisForm.dispose();
            }
        });
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (memberID == 0){
                    addNewMember();
                }else {
                    editMember();
                }
                callingF.loadTable(homeController.members);

                thisForm.dispose();
            }
        });
    }

    /*
    *******
    METHODS
    *******
     */

    public void editMember() {
        for (Member member : homeController.members){
            

            if (member.getMemberID() == memberID) {
                member.setFirstName(firstNameField.getText());
                member.setLastName(lastNameField.getText());
                member.setYearInBand(Integer.parseInt(getYIBField().getText()));
                if (getYesRadioButton().isSelected()){
                    member.setSectionLeader(true);
                }else {
                    member.setSectionLeader(false);
                }
                member.setScore(Double.parseDouble(scoreField.getText()));
                member.setUniform(memberID);
                if (member instanceof Instrumentalist){
                    ((Instrumentalist) member).setInstrument(memberID);
                } else if (member instanceof Bandfront) {
                    ((Bandfront) member).setProp(memberID);
                }
                break;
            }
        }
    }
    public void addNewMember () {

        if (getInstrumentalistRadioButton().isSelected()){
            Member newInstrumentalist = new Instrumentalist();
            newInstrumentalist.setFirstName(firstNameField.getText());
            newInstrumentalist.setLastName(lastNameField.getText());
            newInstrumentalist.setYearInBand(Integer.parseInt(getYIBField().getText()));
            newInstrumentalist.setMemberID(homeController.members.size() + 100);
            if (getYesRadioButton().isSelected()){
                newInstrumentalist.setSectionLeader(true);
            }else {
                newInstrumentalist.setSectionLeader(false);
            }
            newInstrumentalist.setScore(Double.parseDouble(scoreField.getText()));
            newInstrumentalist.setUniform(memberID);
            ((Instrumentalist) newInstrumentalist).setInstrument(memberID);

            homeController.members.add(newInstrumentalist);
        } else if (getBandfrontRadioButton().isSelected()) {
            Member newBandfront = new Bandfront();
            newBandfront.setFirstName(firstNameField.getText());
            newBandfront.setLastName(lastNameField.getText());
            newBandfront.setYearInBand(Integer.parseInt(getYIBField().getText()));
            newBandfront.setMemberID(homeController.members.size() + 100);
            if (getYesRadioButton().isSelected()){
                newBandfront.setSectionLeader(true);
            }else {
                newBandfront.setSectionLeader(false);
            }
            newBandfront.setScore(Double.parseDouble(scoreField.getText()));
            newBandfront.setUniform(memberID);
            ((Bandfront) newBandfront).setProp(memberID);

            homeController.members.add(newBandfront);
        }

    }
    public void deleteMember () {
        for (int i = 0; i < homeController.members.size(); i++) {
            if (homeController.members.get(i).getMemberID() == memberID) {
                homeController.members.remove(i);
                break;
            }
        }
    }

        /*
        *****************************
        GETTERS AND SETTERS ARE BELOW
        *****************************
         */
        public JPanel getPanel1 () {
            return panel1;
        }

        public void setPanel1 (JPanel panel1){
            this.panel1 = panel1;
        }

        public JTextField getFirstNameField () {
            return firstNameField;
        }

        public void setFirstNameField (JTextField firstNameField){
            this.firstNameField = firstNameField;
        }

        public JTextField getLastNameField () {
            return lastNameField;
        }

        public void setLastNameField (JTextField lastNameField){
            this.lastNameField = lastNameField;
        }

        public JTextField getYIBField () {
            return YIBField;
        }

        public void setYIBField (JTextField YIBField){
            this.YIBField = YIBField;
        }

        public JButton getSaveButton () {
            return saveButton;
        }

        public void setSaveButton (JButton saveButton){
            this.saveButton = saveButton;
        }

        public JButton getExitButton () {
            return exitButton;
        }

        public void setExitButton (JButton exitButton){
            this.exitButton = exitButton;
        }


        public JButton getDeleteButton () {
            return deleteButton;
        }

        public void setDeleteButton (JButton deleteButton){
            this.deleteButton = deleteButton;
        }

    public JRadioButton getInstrumentalistRadioButton() {
        return instrumentalistRadioButton;
    }

    public void setInstrumentalistRadioButton(JRadioButton instrumentalistRadioButton) {
        this.instrumentalistRadioButton = instrumentalistRadioButton;
    }

    public JRadioButton getBandfrontRadioButton() {
        return bandfrontRadioButton;
    }

    public void setBandfrontRadioButton(JRadioButton bandfrontRadioButton) {
        this.bandfrontRadioButton = bandfrontRadioButton;
    }

    public JRadioButton getYesRadioButton() {
        return yesRadioButton;
    }

    public void setYesRadioButton(JRadioButton yesRadioButton) {
        this.yesRadioButton = yesRadioButton;
    }

    public JRadioButton getNoRadioButton() {
        return noRadioButton;
    }

    public void setNoRadioButton(JRadioButton noRadioButton) {
        this.noRadioButton = noRadioButton;
    }

    public JTextField getScoreField() {
        return scoreField;
    }

    public void setScoreField(JTextField scoreField) {
        this.scoreField = scoreField;
    }
}

