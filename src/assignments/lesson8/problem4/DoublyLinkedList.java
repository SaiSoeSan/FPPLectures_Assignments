package assignments.lesson8.problem4;

public class DoublyLinkedList {
    Node header;
    DoublyLinkedList(){
        header = new Node(null);
    }
    //1. adds to the end of the list
    public void addLast(String item){
        //create new node
        Node newNode = new Node(item);
        if(header.next != null){  //list is not empty
            Node current = header;
            while (current.next != null) {  // Traverse the list until the last node
                current = current.next;
            }
            current.next = newNode;
            newNode.previous = current;
        }else{ //list is empty
            newNode.previous = header;
            header.next = newNode;
        }
    }

    // 2. Remove by passing object
    public boolean remove(String item){
        if(item == null) return false;

        //List is empty
        if(header.next == null){
            return false;
        }

        //Find to be deleted not by using item
        Node toRemoved = findRemoveNode(item);
        return removeByNode(toRemoved);
    }

    public boolean removeByNode(Node toRemoved){
        if(toRemoved == null) return false;

        if(toRemoved.next == null){ // remove node is last node
            header.next = null;
        }else{
            toRemoved.previous.next = toRemoved.next;
            toRemoved.next.previous = toRemoved.previous;
        }
        toRemoved = null;
        return true;
    }

    public Node findRemoveNode(String item){
        Node current = header.next; // not start from header coz we access value
        while(current.next != null){
            if( current.value.equals(item)){
                return current;
            }
            current = current.next;
        }
        return current;
    }


    // 3. Remove the First Node
    public boolean removeFirst() {
        // Implement
        if(header.next == null) return false;
        Node toDelete = header.next;
        return removeByNode(toDelete);
    }


    // 4. Prints the list from last to first
    public void printReverse() {

        if (header.next == null) {
            System.out.println("[ Null ]");
            return;
        }

        StringBuilder sb = new StringBuilder("[ ");
        Node current = header.next;
        while (current.next != null) {
            current = current.next;
        }

        Node last = current;
        while(last != header.next){
            sb.append(last.value);
            sb.append(" ");
            last = last.previous;
        }
        sb.append(last.value);
        sb.append(" ]");

        System.out.println(sb.toString());
    }

//    @Override
//    public String toString() {
//
//        StringBuilder sb = new StringBuilder();
//        toString(sb, header);
//        return sb.toString();
//
//    }
//    private void toString(StringBuilder sb, Node n) {
//        if(n==null) return;
//        if(n.value != null) sb.append(" " + n.value);
//        toString(sb, n.next);
//    }

    public String toString(){
        StringBuilder bs = new StringBuilder("[");
        Node current = header.next; // not starting from header
        while(current.next != null){ // use another next if we loop before last element
            bs.append(current.value).append(" ");
            current = current.next;
        }
        bs.append(current.value).append("]");
        return bs.toString();
    }

    public String reversePrint(){
        StringBuilder sb = new StringBuilder("[");
        Node current = header.next; //not start header because we access value
        while(current.next != null){
            current = current.next;
        }
        Node last = current;
        while(last.previous != header){
            sb.append(last.value).append(" ");
            last = last.previous;
        }
        sb.append(last.value).append("]");
        return sb.toString();

    }

    public boolean find(String item){
        if(item == null) return false;
        if(header.next == null) return false;
        Node current = header.next; //not start from header
        while(current != null){
            if(current.value.equals(item)){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public int size(){
        int count = 0;
        Node current = header.next; //no count header
        while(current != null){
            count = count + 1;
            current = current.next;
        }
        return count;
    }

    class Node {
        String value;
        Node next;
        Node previous;

        public Node(String value){
            this.value = value;
        }
        public String toString() {
            return value == null ? "null" : value;
        }
    }

    public static void main(String[] args){
        DoublyLinkedList list = new DoublyLinkedList();  //header is created here
        list.addLast("Bob");
        list.addLast("Harry");
        list.addLast("Steve");
        list.addLast("Magdy");
        list.addLast("Cuong");
        list.addLast("Sai");
        System.out.println(list.find("Sai"));
        System.out.println(list.size());
        System.out.println(list);
        System.out.println(list.reversePrint());
//        list.remove("Steve");
//        list.removeFirst();
//        System.out.println(list);
//        list.printReverse();

        // Call all your implemented Methods
    }
}
