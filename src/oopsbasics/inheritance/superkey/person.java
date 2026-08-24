package oopsbasics.inheritance.superkey;

public class person {
    String fname;
    String lname;

    person(String fname, String lname) {
        this.fname = fname;
        this.lname = lname;

        }
    void print(){
        System.out.println(fname + " " + lname);
    }
}

class Student extends person {

    int rollno;

    Student(String fname, String lname, int rollno) {
        super(fname, lname);
        this.rollno = rollno;
    }
    void print1(){
        System.out.println(fname + " " + lname + " " + rollno);
    }
}
class main1{
    public static void main(String[] args) {
        person p=new person("chaithra","venkatesh");
        Student s=new Student("dheeraj","hello",123);
        p.print();
        s.print();
        s.print1();
        p.print();

    }
}

