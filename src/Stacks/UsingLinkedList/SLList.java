package Stacks.UsingLinkedList;

class Node {
    int Data;
    Node next;

    Node(int Data) {
        this.Data = Data;
        this.next = null;
    }
}

public class SLList {

    Node top;

    int maxSize;
    int currentSize;

    SLList(int maxSize) {
        this.top = null;
        this.maxSize = maxSize;
        this.currentSize = 0;
    }


    void push(int val) {

        if (currentSize == maxSize) {
            System.out.println("Overflow");
            return;
        }

        Node n = new Node(val);

        n.next = top;
        top = n;

        currentSize++;
    }


    void pop() {

        if (top == null) {
            System.out.println("Underflow");
            return;
        }
        Node todelete=top;
        top = top.next;
        todelete=null;

        currentSize--;
    }


    void top() {

        if (top == null) {
            System.out.println("Nothing is present");
            return;
        }

        System.out.println(top.Data);
    }


    boolean isEmpty() {

        return top == null;
    }


    int getsize() {

        return currentSize;
    }



    void print() {

        Node temp = top;

        while (temp != null) {
            System.out.print(temp.Data + "->");
            temp = temp.next;
        }
    }
}

class Driver {

    public static void main(String[] args) {

        SLList s = new SLList(4);

        s.push(40);
        s.push(50);
        s.push(30);

        s.print();

        System.out.println("Size: " + s.getsize());

        s.pop();
        s.print();
        s.top();

        System.out.println("Empty: " + s.isEmpty());

        s.print();

        System.out.println("Size: " + s.getsize());
    }
}