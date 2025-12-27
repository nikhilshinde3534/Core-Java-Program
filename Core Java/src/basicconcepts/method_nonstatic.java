package basicconcepts;

public class method_nonstatic {

	public static void main(String[] args) {
		
		//1.Creating Object
		method_nonstatic obj=new method_nonstatic();
		
		//2.Call method_nonststic method using object
		obj.add();
	}
	
	void add()
	{
		System.out.println("Addition is:" +(4+8));
	}
}

