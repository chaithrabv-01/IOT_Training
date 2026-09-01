package Queues.UsingArrays;

public class Queue {
    int[] arr;
    int front;
    int back;
    int size;

    Queue(int size){
        this.size=size;
        arr=new int[size];
        front=-1;
        back=-1;
    }

    void push(int val){
        if(back==size-1){
            System.out.println("Overflow");
            return;
        }
        back++;
        arr[back]=val;
        if(front==-1){
            front++;
        }
    }

    void pop(){
        if(front==-1 || front>back){
            System.out.println("Underflow");
            return;
        }
        arr[front]=0;
        front++;
    }

    int  Peak(){
        if(front==-1 || front>back){
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[front];
    }

    boolean isEmpty(){
        return (front==-1 || front>back);
    }
}

class Driver{
    public static void main(String[] args) {
        Queue q=new Queue(5);
        q.push(10);
        q.push(20);
        q.push(30);
        System.out.println(q.Peak());
    }
}
