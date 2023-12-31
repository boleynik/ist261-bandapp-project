package views;

import controllers.HomeController;
import models.DataEngine;
import models.Member;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;


public class HomeUI extends JFrame{
    private JPanel homePanel;
    private JTable homeTable;
    private JButton addButton;
    private JButton exitButton;

    private HomeUI callingForm;

    private HomeController homeController;

    public HomeUI(HomeController controller){
        callingForm = this;
        this.homeController = controller;

        loadTable(controller.members);
        callingForm.setLocationRelativeTo(null);

        this.setContentPane(homePanel);

        addButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                AddMember addUI = new AddMember(homeController, callingForm);
                addUI.setVisible(true);
            }
        });

        homeTable.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                editRecord();

            }
        });
        exitButton.addActionListener(e -> {
            DataEngine de = new DataEngine();
            de.saveData(homeController.members, "data/member.csv");
            System.exit(0);
        });


    }
    public void loadTable(ArrayList<Member> members)
    {
        String headers[] = {"ID", "First Name", "Last Name", "Year in Band", "Score"};
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(headers);
        for(Member member : members)
        {
            model.addRow(new Object[] {member.getMemberID(), member.getFirstName(), member.getLastName(), member.getYearInBand(), member.getScore()});
        }
        homeTable.setModel(model);
    }


    public JPanel getHomePanel() {
        return homePanel;
    }

    public JTable getHomeTable() {
        return homeTable;
    }

    public JButton getAddButton() {
        return addButton;
    }

    public JButton getExitButton() {
        return exitButton;
    }

    public void editRecord(){
        int selectedRow = homeTable.getSelectedRow();

        String firstName;
        String lastName;
        int yearInBand;
        int memberid;

        memberid = (Integer)homeTable.getValueAt(selectedRow, 0);
        firstName = (String)homeTable.getValueAt(selectedRow, 1);
        lastName = (String)homeTable.getValueAt(selectedRow, 2);
        yearInBand = (Integer)homeTable.getValueAt(selectedRow, 3);

        AddMember addui = new AddMember(memberid, firstName, lastName, yearInBand, callingForm, homeController);
        addui.setVisible(true);
    }



}

