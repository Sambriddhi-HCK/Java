public class Employee {
    // Data members
    String name;
    int age;
    int phone_number;
    String address;
    double salary;

    // method to print salary of the employee
    void printSalary(String name, double salary) {
        System.out.println("The salary of " + name + " is: " + salary);
    }
    public static void main(String[] args) {
        // creating an object of the Employee class
    Employee obj = new Employee();
    // assigning values to the data members 
    obj.name = "Stally";
    obj.age= 23;
    obj.phone_number = 427823;
    obj.address = " 19th Avenue Street, MN ";
    obj.salary = 4000.00;
    obj.printSalary(obj.name, obj.salary);
    }
}
    