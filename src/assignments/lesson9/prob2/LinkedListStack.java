package assignments.lesson9.prob2;

public class LinkedListStack {

    private Node top;
    int count;

    class Node{
        Object data;
        Node next;
        Node previous;

        public Node(Object item){
            data = item;
        }
    }

    public void push(Object item) {
        if(item == null) return;

        Node p = new Node(item);
        //no item in stack
        if(top == null){
            top = p;
        }else{
            p.next = top;
            top.previous = p;
            top = p;
        }
        count++;
    }

    public String toString(){
        Node p = top;

        if(p == null){
            return "Stack is empty";
        }
        StringBuilder sb = new StringBuilder();
        while(p != null){
            sb.append(p.data).append(" ");
            p = p.next;
        }
        return sb.toString();
    }

    public Object pop() {
        if(isEmpty()) return null; //if stack is empty
        Object item = top.data;
        top = top.next;
        top.previous = null;
        count--;
        return item;
    }

    public Object peek(){
        if(isEmpty()) return null;
        return top.data;
    }

    public int size(){
        return count;
    }

    public boolean isEmpty(){
        return top == null;
    }
}

