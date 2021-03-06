package entities;

public class Employee extends Person {

    String addimission;
    double salary;

    public Employee(String name, int identity, String birth, double salary, String addmission) {
        super(name, identity, birth);
        this.addimission = addmission;
        this.salary = salary;
    }

    double whatSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return super.toString() + "employee [addimission=" + addimission + ", salary=" + salary + "] ";
    }

}
