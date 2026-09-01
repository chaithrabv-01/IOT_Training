package LinkedList.Singly;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SSL {

    Node head;

    SSL() {
        this.head = null;
    }

    void insertAtTail(int val) {
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
    }

    void insertAtHead(int val) {
        Node n = new Node(val);

        n.next = head;
        head = n;
    }

    void insertAtPos(int val, int pos) {

        int size = getLLSize();

        if (pos < 0 || pos > size) {
            System.out.println("get lost");
        }

        else if (pos == 0) {
            Node n = new Node(val);
            n.next = head;
            head = n;
        }

        else {
            Node n = new Node(val);
            Node temp = head;

            while (--pos > 0) {
                temp = temp.next;
            }

            n.next = temp.next;
            temp.next = n;
        }
    }

    void deleteAtHead(){
        if(head==null){
            System.out.println("LinkedList is empty");
            return;
        }
        Node toDelete=head;
        head=head.next;
        System.out.println("Element deleted is "+ toDelete.data);
        toDelete=null;   //garbage value
    }

    void deletebyValue(int val){
        if(head==null){
            System.out.println("linkedlist is empty");
            return;
        }
        if(head.data==val){
            Node to=head;
            to=null;
            return;
        }
        Node temp=head;
        while(temp.next!=null && temp.next.data!=val){
            temp=temp.next;
        }
        if(temp.next==null){
            System.out.println("element not found");
            return;
        }
        Node toDelete=temp.next;
        temp.next=temp.next.next;
        toDelete=null;

    }

    void print() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }

        System.out.println("Null");
    }

    int getLLSize() {
        int size = 0;
        Node temp = head;

        while (temp != null) {
            temp = temp.next;
            size++;
        }

        return size;
    }
}

class Driver {

    public static void main(String[] args) {

        SSL ssl = new SSL();

        ssl.insertAtTail(50);
        ssl.print();

        ssl.insertAtHead(10);
        ssl.insertAtHead(20);
        ssl.print();

        ssl.insertAtHead(30);
        ssl.print();

        ssl.insertAtTail(40);
        ssl.print();

        ssl.insertAtPos(67, 4);
        ssl.print();

        ssl.insertAtTail(100);
        ssl.print();

        ssl.deleteAtHead();
        ssl.print();

        ssl.deletebyValue(10);
        ssl.print();
    }
}