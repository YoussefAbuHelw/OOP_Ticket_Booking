import javax.swing.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void PrintInfo() {
        JOptionPane.showMessageDialog(null, " Football World Cup Ticket Reservation :" +
                "\n" + "Cities on which World Cup is held: (C1 ,C2 ,C3 ,C4 ,C5 ,C6 ,C7 ,C8 )" + "\n" +
                "   stadiums :(S1 ,S2 ,S3 ,S4 ,S5 ,S6 ,S7 ,S8 )" + "\n" + "  Teams :32 team " + "\n" +
                "  Groups :(G1 ,G2 ,G3 ,G4 ,G5 ,G6 ,G7 ,G8 )" + "\n" + "  G1:  T11 T21 T31 T41 " + "\n" +
                "  G2:  T12 T22 T32 T42 " + "\n" + "  G3:  T13 T23 T33 T43 " + "\n" + "  G4:  T14 T24 T34 T44 " +
                "\n" + "  G5:  T15 T25 T35 T45 " + "\n" + "  G6:  T16 T26 T36 T46 " + "\n" +
                "  G7:  T17 T27 T37 T47" + "\n" + "  G8: T18 T28 T38 T48 :");
    }

    public static ArrayList<Team> generateTeams(int index) {

        ArrayList<Team> t = new ArrayList<>(4);
        for (int i = 0; i < 4; i++) {
            String name = "T" + (i + 1) + index;
            t.add(new Team(name));
        }
        return t;
    }

    public static ArrayList<String> generateMatches(Team[] a) {
        ArrayList<String> arr = new ArrayList<>(6);
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                arr.add(a[i].getName() + " - " + a[j].getName());
            }
        }
        return arr;
    }

    public static void exit(String str) {
        if (str == null)
            System.exit(404);
    }

    public static Random random = new Random();

    public static void main(String[] args) {
        PrintInfo();

        String name = JOptionPane.showInputDialog("Enter Your Name:");
        exit(name);
        String nationalNumber = JOptionPane.showInputDialog("Enter Your National Number:");
        exit(nationalNumber);
        String address = JOptionPane.showInputDialog("Enter Address:");
        exit(address);
        int age;
        age = Integer.parseInt(JOptionPane.showInputDialog("Enter age Greater than 18:"));
        if (age < 18) {
            JOptionPane.showMessageDialog(null, "Your Age Must be greater than 18", "Error", JOptionPane.INFORMATION_MESSAGE);
            age = Integer.parseInt(JOptionPane.showInputDialog("Enter age Greater than 18:"));
        }
        Person person = new Person(name, nationalNumber, age, address);// Person


        String[] GroupName = {"G1", "G2", "G3", "G4", "G5", "G6", "G7", "G8"};
        String[] cityName = {"C1", "C2", "C3", "C4", "C5", "C6", "C7", "C8"};
        String[] StadiumName = {"S1", "S2", "S3", "S4", "S5", "S6", "S7", "S8"};
        int[] price = {100, 200, 300};

        String input = (String) JOptionPane.showInputDialog(null, "Choose now...", "Choose Group Name", JOptionPane.QUESTION_MESSAGE, null, GroupName, GroupName[0]);
        int num = input.charAt(1) - '0';

        String Stadium = StadiumName[num - 1];

        Team[] a = generateTeams(num).toArray(new Team[0]);

        City city = new City(cityName[num - 1]);      //City

        Stadium stadium = new Stadium(Stadium, city, price);//Stadium
        Group g = new Group(GroupName[num - 1], a, stadium);//Group


        String[] b = generateMatches(a).toArray(new String[0]);

        String MatchDay = (String) JOptionPane.showInputDialog(null, "Choose now...", "Choose Match", JOptionPane.QUESTION_MESSAGE, null, b, b[0]);

        Match match = new Match(g, MatchDay, "20/10/2022"); // Match

        String[] category = {"category 1", "category 2", "category 3"};
        int cat = JOptionPane.showOptionDialog(null, "1 for 100$ - 2 for 200$ - 3 for 300$ : ", "Choose category ", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, category, category[0]);
        cat++;

        int seatNumber = 1 + random.nextInt(60_000);
        Ticket ticket = new Ticket(match, cat, seatNumber);//ticket

        ticket.printTicket(person);

    }
}