package lectures.lesson8.consistcompareTo.Node;

public class Node {
    int value;
    Node next;
    Node previous;

    Node(int value){
        this.value = value;
    }

    public String toString(){
        return value + "";
    }
}
