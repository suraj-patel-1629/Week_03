package datastructure.linkedlist.practiceproblem.onlineticketreservationsystem;

public class OnlineTicketReservationSystem {
    public static void main(String[] args) {
        CircularLinkedListOnlineTicketReservationSystem system = new CircularLinkedListOnlineTicketReservationSystem();

        // Add tickets
        system.addTicket(101, "Pratham", "Inception", "A1", "10:00 AM");
        system.addTicket(102, "Vivek", "Interstellar", "B2", "01:00 PM");
        system.addTicket(103, "Suraj", "Inception", "C3", "04:00 PM");

        // Display tickets
        system.displayTickets();

        // Search for a ticket
        system.searchTicket("Inception");

        // Remove a ticket
        system.removeTicket(102);

        // Display tickets again
        system.displayTickets();

        // Count total tickets
        System.out.println("Total tickets booked: " + system.countTickets());
    }
}
