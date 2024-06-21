package finalPractice.overrideHashCode;

import java.util.Arrays;

public class ArrayQueueaml {
    int front = -1;
    int rear = 0;
    int LENGTH = 10;
    int[] arr = new int[LENGTH];

    public void enqueue(int obj){
        if(isEmpty()){
            resize();
        }
        if(front == -1){ //only first time
            front++;
        }
        arr[rear++] = obj;
    }

    public int dequeue() {
        if(isEmpty()) return - 1;
        int first = arr[front];
        front++;
        return first;
    }

    public int size(){
        if(isEmpty()) return 0;
        return rear - front;
    }

    public void resize(){
        Arrays.copyOf(arr,arr.length * 2);
    }

    public boolean isEmpty(){
        return front == -1;
    }

    public static void main(String[] args) {
        ArrayQueueaml aq = new ArrayQueueaml();
        aq.enqueue(4);
        aq.enqueue(5);
        aq.enqueue(6);
        aq.dequeue();
        System.out.println(aq.size());
    }
}
