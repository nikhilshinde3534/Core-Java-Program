package Oops;

public class bank_info implements bank {

	@Override
	public void bank() {
		// TODO Auto-generated method stub
		
		System.out.println("Bank Name : Bank of Maharashtra");
		System.out.println("A/C holder name : Nikhil Shinde");
		System.out.println("Bank Balance : 500000");
	}
	
	public static void main(String[] args) {
		
		bank_info ob = new bank_info();
		ob.bank();
	}
}
