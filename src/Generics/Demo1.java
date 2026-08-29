package Generics;

import java.util.ArrayList;

public class Demo1 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList();
//        list.add("Chaithra");///compile time error detection
        list.add(10);
    }
}
