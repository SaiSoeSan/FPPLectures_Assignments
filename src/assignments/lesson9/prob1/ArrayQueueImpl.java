package assignments.lesson9.prob1;

import java.util.Arrays;

public class ArrayQueueImpl {
    private int[] arr = new int[10];
    private int front = -1;
    private int rear = 0;

    public int peek() {
        if(isEmpty()) return -1;
        return arr[front];
    }

    //add into queue
    public void enqueue(int obj){

        //if array is null or array is full, resize
        if(arr == null || isFull()){
            resize();
        }

        if(isEmpty()){ //a. if queue is empty, put in rear position
            arr[rear] = obj;
        }else {  //b. queue is not empty, put in after rear position
            arr[++rear] = obj;
        }
    }

    //remove from queue( remove from front)
    public int dequeue() {
        if(arr == null || isEmpty()) return -1;
        int item = arr[front];
        arr[front] = 0;  // set back to default value
        front++;
        return item;
    }

    public boolean isEmpty(){ // no element in array
        return front == -1;
    }

    public boolean isFull(){
        return size() == arr.length;
    }

    public int size(){
        return rear+1;
    }
    private void resize(){
        arr = Arrays.copyOf(arr,arr.length * 2);
    }

    @Override
    public String toString() {
        if(front == -1) return "<empty>";
        StringBuilder sb = new StringBuilder();
        System.out.println(front);
        System.out.println(rear);
        for(int i = front; i <= rear; i++){
            sb.append(arr[i]).append(" ");
        }
        return sb.toString();
    }

}
