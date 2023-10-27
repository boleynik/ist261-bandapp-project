package views;

import controllers.HomeController;
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
    private HomeController homeController;
    private HomeUI callingF;
    private int memberID;
    private AddMember thisForm;



    /*
    ************
    CONSTRUCTORS
    ************
     */
    public AddMember(HomeController homeControllerpPassedIn, HomeUI callingForm){

        homeController = homeControllerpPassedIn;
        callingF = callingForm;
        thisForm = this;
        this.setSize(400, 250);
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
    public AddMember(int memberID, String firstName, String lastName,
                     int yearInBand, HomeUI callingFormIn, HomeController controllerIn){
        firstNameField.setText(firstName);
        lastNameField.setText(lastName);
        YIBField.setText(String.valueOf(yearInBand));
        this.memberID = memberID;
        callingF = callingFormIn;
        homeController = controllerIn;
        thisForm = this;

        this.setSize(400, 250);
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
                break;
            }
        }
    }
    public void addNewMember () {
        Member newMember = new Member();
        newMember.setFirstName(firstNameField.getText());
        newMember.setLastName(lastNameField.getText());
        newMember.setYearInBand(Integer.parseInt(getYIBField().getText()));
        newMember.setMemberID(homeController.members.size() + 100);
        homeController.members.add(newMember);
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

    }
