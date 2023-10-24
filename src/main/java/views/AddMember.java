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
    private HomeController homeController;
    private HomeUI callingF;

    private AddMember thisForm;

    public AddMember(HomeController homeControllerpPassedIn, HomeUI callingForm){

        homeController = homeControllerpPassedIn;
        callingF = callingForm;
        thisForm = this;
        this.setSize(250, 250);
        setContentPane(panel1);
        setLocationRelativeTo(null);

        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Member newMember = new Member();

                newMember.setFirstName(firstNameField.getText());
                newMember.setLastName(lastNameField.getText());
                newMember.setMemberID(homeController.members.size()+1);

                homeControllerpPassedIn.members.add(newMember);

                callingF.loadTable(homeControllerpPassedIn.members);

                thisForm.dispose();
            }
        });
    }


    public AddMember(String firstName, String lastName, int yearInBand){
        firstName = firstNameField.getText();
        lastName = lastNameField.getText();
        yearInBand = Integer.parseInt(YIBField.getText());

        this.setSize(250, 250);
        setContentPane(panel1);
        setLocationRelativeTo(null);
    }

    public JPanel getPanel1() {
        return panel1;
    }

    public void setPanel1(JPanel panel1) {
        this.panel1 = panel1;
    }

    public JTextField getFirstNameField() {
        return firstNameField;
    }

    public void setFirstNameField(JTextField firstNameField) {
        this.firstNameField = firstNameField;
    }

    public JTextField getLastNameField() {
        return lastNameField;
    }

    public void setLastNameField(JTextField lastNameField) {
        this.lastNameField = lastNameField;
    }

    public JTextField getYIBField() {
        return YIBField;
    }

    public void setYIBField(JTextField YIBField) {
        this.YIBField = YIBField;
    }

    public JButton getSaveButton() {
        return saveButton;
    }

    public void setSaveButton(JButton saveButton) {
        this.saveButton = saveButton;
    }

    public JButton getExitButton() {
        return exitButton;
    }

    public void setExitButton(JButton exitButton) {
        this.exitButton = exitButton;
    }
}
