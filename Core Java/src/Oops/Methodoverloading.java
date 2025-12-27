package Oops;

public class Methodoverloading {

	void payment() //by passing no parameter
	{
		System.out.println("Creadit");
	}
	
	void payment(int num) //by passing parameter
	{
		System.out.println("Debit");
	}
	
	void payment(int r,String name) //by passing number of parameter
	{
		System.out.println("Cash on Delivery");
	}
	
	void payment(String p, int c) //by passing the sequence of parameter
	{
		System.out.println("UPI");
	}
	
	void payment(float z,char w) //by passing the datatype
	{
		System.out.println("Paytm");
	}
	
	public static void main(String[] args) {
		
		Methodoverloading ob=new Methodoverloading();
		ob.payment();
		ob.payment(100);
		ob.payment(20, "Cravita");
		ob.payment("Nikhil", 10);
		ob.payment(1.0f, 'A');
	}
}
