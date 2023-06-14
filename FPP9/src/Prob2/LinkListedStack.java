package Prob2;

public class LinkListedStack {
    public class Node{
        Object value;
        Node next;
        Node(Object x){value = x;}
    }

    int size;
    Node header;

    public LinkListedStack(){
        size = 0;
        header = new Node(0);
    }

    public void push(Object item){
        size++;
        Node curr = header;
        while(curr.next != null){
            curr = curr.next;
        }
        Node toAdd = new Node(item);
        toAdd.next = curr.next;
        curr.next = toAdd;

    }

    public Object pop(){
        Node curr = header;
        if(isEmpty()){
            System.out.println("Stack is empty.");
            return null;
        }
        size--;
        while(curr.next != null){
            curr = curr.next;
        }
        Node popItem = curr;
        curr = header;
        for(int i=0;i<size;i++){
            curr = curr.next;
        }
        curr.next = null;

        return popItem.value;
    }

    public Object peek(){
        Node curr = header;
        if(isEmpty()){
            System.out.println("Stack is empty.");
            return null;
        }
        while(curr.next != null){
            curr = curr.next;
        }
        return curr.value;
    }

    public boolean isEmpty(){return (header.next ==null);}

    public int size(){return size;}
}
