package Oops;

public class signal_data implements signal {

	@Override
	public void color() {
		// TODO Auto-generated method stub
		
		System.out.println("Red color are stopping vehicle");
		System.out.println("Green color ");
		System.out.println("Yellow color");
	}

	public static void main(String[] args) {
		signal_data ob=new signal_data();
		ob.color();
		ob.location();
			
	}
}


