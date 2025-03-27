import javax.swing.*;

public class Ticket {
    private Match match;
    private int category;
    private int seatNumber;
    String n = "thanks";

    public Ticket(Match match, int category, int seatNumber) {
        this.match = match;
        this.category = category;
        this.seatNumber = seatNumber;
    }

    public void printTicket(Person owner) {
        JOptionPane.showMessageDialog(null, "Ticket owner: " + owner.getName() + "\n" + "National number: " + owner.getNationalNumber() + "\n" + "Age: " + owner.getAge() + "\n" +
                        "Address: " + owner.getAddress() + "\n" + "Match: " + match.getGroup().getName() + " - " + match.getTeams().substring(0, 3) + " vs " + match.getTeams().substring(4, 9) + "\n" +
                        "Stadium: " + match.getGroup().getStadium().getName() + " in " + match.getGroup().getStadium().getCity().getName() + "\n" + "Date and time: " + match.getDateTime() + "\n" +
                        "Category: " + category + "\n" + "Seat number: " + seatNumber + "\n" + "Price: " + match.getGroup().getStadium().getPrice(category) + "\n"
                , "------------------Ticket------------------", JOptionPane.INFORMATION_MESSAGE);


        System.out.println("Ticket owner: " + owner.getName());
        System.out.println("National number: " + owner.getNationalNumber());
        System.out.println("Age: " + owner.getAge());
        System.out.println("E-Mail Address: " + owner.getAddress());
        System.out.println("Match: " + match.getGroup().getName() + " - " + match.getTeams().substring(0, 3) + " vs " + match.getTeams().substring(6, 9));
        System.out.println("Stadium: " + match.getGroup().getStadium().getName() + " in " + match.getGroup().getStadium().getCity().getName());
        System.out.println("Date and time: " + match.getDateTime());
        System.out.println("Category: " + category);
        System.out.println("Seat number: " + seatNumber);
        System.out.println("Price: " + match.getGroup().getStadium().getPrice(category));

    }

    public boolean checkAge(Person owner) {
        return (owner.getAge() >= 18);
    }


    public Match getMatch() {
        return match;
    }

    public void setMatch(Match match) {
        this.match = match;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "match=" + match +
                ", category=" + category +
                ", seatNumber=" + seatNumber +
                '}';
    }
}
