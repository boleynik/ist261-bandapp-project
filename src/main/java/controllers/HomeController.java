package controllers;

import models.Member;
import views.HomeUI;

import javax.swing.*;
import java.util.ArrayList;

public class HomeController {

    private HomeUI homeUI;

    public ArrayList<Member> members;

    public HomeController(ArrayList<Member> membersfromMain) {
        members = membersfromMain;

        homeUI = new HomeUI(this);


        homeUI.setTitle("Marching Band App");
        homeUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // close behavior
        homeUI.setLocationRelativeTo(null);
        homeUI.setSize(500, 500);
        homeUI.setVisible(true);

        homeUI.getAddButton().addActionListener(e -> homeUI.editRecord());


    }
}
