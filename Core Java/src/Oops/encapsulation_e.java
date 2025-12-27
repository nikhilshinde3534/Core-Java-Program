package Oops;

public class encapsulation_e {
private int employee_id;
private float employee_salary;

void set_e_id(int employee_id)
{
	this.employee_id=employee_id;
}
int get_e_id()
{
	return employee_id;
}

void set_e_salary(float employee_salary)
{
	this.employee_salary=employee_salary;
}
float get_e_salary()
{
	return employee_salary;
}

public static void main(String[] args) {
	encapsulation_e ob=new encapsulation_e();
	ob.set_e_id(101);
	System.out.println("Employee id is : " +ob.get_e_id());
	
	ob.set_e_salary(60000);
	System.out.println("Employee salary is : " +ob.get_e_salary());
}
}


