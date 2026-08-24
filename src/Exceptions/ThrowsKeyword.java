package Exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ThrowsKeyword {
    public static void main(String[] args) throws IOException {
        String i;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        i=br.readLine();
        System.out.println(i);
//        String n;
//        Scanner sc=new Scanner(System.in);
//        n=sc.nextLine();
//        System.out.println(n);
    }
}
