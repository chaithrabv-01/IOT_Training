package oopsbasics.inheritance.abstraction;

public class Employee {
    private String empName;
    private int empId;

    Employee(String empName,int empId){
        this.empName=empName;
        this.empId=empId;
    }
    String getEmpName(){
        return empName;
    }
    void setEmpName(String empName){
        this.empName=empName;
    }
     void print(){
        System.out.println(this.empName);
        System.out.println(this.empId);
    }
}
class main1{
    public static void main(String[] args) {
        Employee e1=new Employee("Chaithra",124);
        e1.print();
        e1.setEmpName("hello");
        System.out.println(e1.getEmpName());

    }
}
