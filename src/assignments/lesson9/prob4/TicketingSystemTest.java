package assignments.lesson9.prob4;

public class TicketingSystemTest {
    public static void main(String[] args) {
        TicketingSystem sys = new TicketingSystem();
        sys.addTicket("World Cup");
        sys.addTicket("Taylor Swift");
        sys.processTicket();
        System.out.println("Next Ticket is " + sys.viewNextTicket().toString());
        sys.listTickets();
    }
}
