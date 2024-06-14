package lectures.lesson8.consistcompareTo.Node;

public class TestNode {
    public static void main(String[] args) {
        Node s = new Node(10);
        Node secondNode = new Node(20);

        s.next = secondNode;
        secondNode.previous = s;

        System.out.println(s);
        System.out.println(s.next);
        System.out.println(secondNode.previous);


        Node no = new Node(15);
        s.next = no;
        no.previous = s;
        no.next = secondNode;
        secondNode.previous = no;

        Node currentNode = s;
        while(currentNode != null){
            System.out.println(currentNode.value);
            currentNode = currentNode.next;
        }

        //sum total of nodes value
        int sum = 0;
        for(Node current = s; current != null; current = current.next){
            sum += current.value;
        }
        System.out.println(sum);
    }
}
