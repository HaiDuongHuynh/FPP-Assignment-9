package Prob2;

public class Main {
    public static void main(String[] args) {
        LinkListedStack l = new LinkListedStack();
        System.out.println("Is Stack empty? " + l.isEmpty());
        l.push(5);
        l.push(6);
        l.push("Star");
        System.out.println("Size of stack: " + l.size());
        System.out.println("Item on top of the stack: " + l.peek());
        System.out.println("Pop 1 stack...");
        l.pop();
        System.out.println("Item on top of the stack: " + l.peek());
        System.out.println("Size of stack: " + l.size());
    }
}
