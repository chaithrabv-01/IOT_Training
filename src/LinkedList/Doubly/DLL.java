package LinkedList.Doubly;

class Node {

    int Data;
    Node prev;
    Node next;

    Node(int Data) {
        this.Data = Data;
        this.prev = null;
        this.next = null;
    }
}

public class DLL {

    Node head;

    DLL() {
        this.head = null;
    }


    void InsertHead(int val) {

        Node n = new Node(val);

        if (head == null) {
            head = n;
            return;
        }

        n.next = head;
        head.prev = n;
        head = n;
    }


    void InsertTail(int val) {

        Node n = new Node(val);

        if (head == null) {
            head = n;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = n;
        n.prev = temp;
    }


    void InsertAtPos(int val, int pos) {

        int size = getsize();

        if (pos < 0 || pos > size) {

            System.out.println("Invalid");

        }


        else if (pos == 0) {

            Node n = new Node(val);

            n.next = head;
            if(head!=null) {
                head.prev = n;
            }

            head = n;
        }


        else {

            Node n = new Node(val);
            Node temp = head;

            while (--pos > 0) {
                temp = temp.next;
            }

            n.next = temp.next;
            n.prev = temp;

            if (temp.next != null) {
                temp.next.prev = n;
            }

            temp.next = n;
        }
    }


    int getsize() {

        int size = 0;
        Node temp = head;

        while (temp != null) {
            temp = temp.next;
            size++;
        }

        return size;
    }


    void print() {

        Node temp = head;

        while (temp != null) {

            System.out.print(temp.Data + " ⇄ ");

            temp = temp.next;
        }

        System.out.println("null");
    }
}

class Driver {

    public static void main(String[] args) {

        DLL d = new DLL();

        d.InsertHead(10);
        d.InsertHead(20);
        d.InsertHead(30);

        d.print();

        d.InsertTail(40);

        d.print();

        d.InsertAtPos(50, 2);

        d.print();

        d.InsertAtPos(5, 0);

        d.print();

    }
}