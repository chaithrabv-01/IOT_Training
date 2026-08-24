package methods;

public class functionStack {
    static void print1(){
        System.out.println("hi");
        print1();
    }

    public static void main(String[] args) {
        print1();
    }
}
