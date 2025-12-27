package constructor;

class Employee 
{
    int emp_id;
    String emp_name;

    // Parameterized constructor
    Employee(int emp_id, String emp_name) 
    {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        System.out.println("emp id : " + this.emp_id);
        System.out.println("emp name : " + this.emp_name);
    }

    // Copy constructor
    Employee(Employee e) 
    {
        this.emp_id = e.emp_id;
        this.emp_name = e.emp_name;
        System.out.println("Copy of emp id : " + this.emp_id);
        System.out.println("Copy of emp name : " + this.emp_name);
    }
}

public class copy_constructor {
    public static void main(String[] args) 
    {
        Employee emp1 = new Employee(23, "Nikhil");
        System.out.println();
        Employee emp2 = new Employee(emp1);
    }
}
