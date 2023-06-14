package Prob1;

public class Main {
    public static void main(String[] args) {
        ArrayQueueImp arr = new ArrayQueueImp();
        arr.dequeue();
        arr.enqueue(1);
        arr.enqueue(2);
        arr.enqueue(3);
        arr.enqueue(4);
        arr.enqueue(5);
        arr.enqueue(6);
        System.out.println("Array Queue: ");
        arr.display();
        System.out.println("\nSize of queue: " + arr.size());
        arr.dequeue();
        System.out.println("Array after dequeue: ");
        arr.display();
        System.out.println("\nItem at the front of the queue is: " + arr.peek());
    }
}