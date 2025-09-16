import java.util.Scanner;

class MovieTicket {
    private String movieName;
    private int seatNumber;
    private double price;

    public MovieTicket(String movieName, double basePrice) {
        this.movieName = movieName;
        this.price = basePrice;
    }

    public void bookTicket(int seatNumber) {
        this.seatNumber = seatNumber;
        System.out.println("Ticket booked successfully!");
    }

    public void displayTicketDetails() {
        System.out.println("Movie: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: ₹" + price);
    }
}

public class MovieBooking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        MovieTicket ticket = new MovieTicket("Avengers: Endgame", 350);
        
        System.out.print("Enter seat number to book: ");
        int seat = scanner.nextInt();
        
        ticket.bookTicket(seat);
        ticket.displayTicketDetails();
        
        scanner.close();
    }
}