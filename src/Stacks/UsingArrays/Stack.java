package Stacks.UsingArrays;

public class Stack {
    int [] arr;
    int top;
    int size;
    Stack(int size){
        this.size=size;
        top=-1;
        arr=new int[size];
    }

    void push(int val){
        if(top==size-1){
            System.out.println("Overflow");
            return;
        }
        top++;
        arr[top]=val;
    }

    void pop(){
        if(top==-1){
            System.out.println("underflown");
        }
        arr[top]=0;
        top--;

    }

    int Top(){
        if(top==-1){
            System.out.println("underflow");
            return -1;
        }
        return arr[top];
    }

    boolean isEmpty(){
        if(top==-1){
            return true;
        }
        return false;
    }

}

class Driver{
    public static void main(String[] args) {
        Stack s=new Stack(4);
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s.Top());
        s.push(4);
        s.push(5);

    }
}
