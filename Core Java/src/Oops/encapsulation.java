package Oops;

public class encapsulation {
private long student_aadhar_no;
private String student_account_number;

void set_s_acno(String student_account_number)
{
	this.student_account_number=student_account_number;
}
String get_s_acno()
{
	return student_account_number;
}

void set_aadharno(long student_aadhar_no)
{
	this.student_aadhar_no=student_aadhar_no;
}
long get_aadharno()
{
	return student_aadhar_no;
}

public static void main(String[] args) {
	encapsulation ob=new encapsulation();
	ob.set_aadharno(515273724256l);
	System.out.println("Student aadhar number is : "+ob.get_aadharno());
	
	ob.set_s_acno("SBI3456");
	System.out.println("Student account number is : "+ob.get_s_acno());
}
}


