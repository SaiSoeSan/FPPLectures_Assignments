package assignments.lesson9.prob1;

public class Main {
    public static void main(String[] args) {
        ArrayQueueImpl aq = new ArrayQueueImpl();
        aq.enqueue(50);
        aq.enqueue(40);
        aq.enqueue(30);
        aq.enqueue(20);
        aq.dequeue();
        System.out.println(aq);
        System.out.println(aq.peek());
    }
}
