package assignments.lesson9.prob4;

import java.util.LinkedList;
import java.util.Queue;

public class TicketingSystem {

    Queue<Ticket> myqueue;

    public TicketingSystem(){
        this.myqueue = new LinkedList<>();
    }

    public boolean addTicket(String description){
        Ticket t = new Ticket(description);
        myqueue.offer(t);
        return true;
    }

    public Ticket processTicket(){
        if(myqueue.isEmpty()) return null;
        return myqueue.remove();
    }

    public Ticket viewNextTicket(){
        if(myqueue.isEmpty()) return null;
        return myqueue.peek();
    }

    public void listTickets() {
        if (myqueue.isEmpty()) {
            System.out.println("The ticket queue is empty.");
            return;
        }

        System.out.println("Listing all tickets in the queue:");
        for (Ticket ticket : myqueue) {
            System.out.println(ticket);
        }
    }
}
