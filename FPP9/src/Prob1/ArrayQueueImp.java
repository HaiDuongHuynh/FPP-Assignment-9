package Prob1;

public class ArrayQueueImp {
    private int[] arr = new int[10];
    private int front = -1;
    private int rear = 0;
    public int peek() {
//implement
        if(isEmpty()){
            System.out.println("Queue is empty.");
            return -1;
        }
        return arr[front];
    }
    public void enqueue(int obj){
//implement
        if(rear ==arr.length){
            resize();
        }
        arr[rear++] = obj;
        if(front ==-1){
            front =0;
        }

    }
    public int dequeue() {
//implement
        if(isEmpty()){
            System.out.println("Queue is empty.");
            return -1;
        }
        int item = arr[front];
        front++;
        if(front == rear){
            //reset
            front = -1;
            rear = 0;
        }
        return item;

    }
    public boolean isEmpty(){
//implement
        return (front == -1);
    }
    public int size(){
//implement
        if(isEmpty()){return 0;}
        return rear - front;
    }
    private void resize(){
//implement
        int[] newArr = new int[arr.length*2];
        System.arraycopy(arr,0,newArr,0,size());
        arr = newArr;
    }
    public void display(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
        }
        else {
            for (int i = front; i < rear; i++) {

                System.out.print(arr[i] + " ");
            }
        }
    }
}
