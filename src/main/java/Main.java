import controllers.HomeController;
import models.DataEngine;
import models.Member;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        DataEngine de = new DataEngine();

        ArrayList<Member> members = de.loadMemberData("data/member.csv");

        HomeController homeController = new HomeController(members);


    }
}
