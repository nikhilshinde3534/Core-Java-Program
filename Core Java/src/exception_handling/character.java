package exception_handling;

public class character {

	public static void main(String[] args) {
		
		char ch[]=new char[2];
		     ch[0]='A';
		     ch[1]='*';
		     
		     try
		     {
		    	 ch[2]='O';
		     }
		     
		     catch(Exception e)
		     {
		    	 System.out.println(e);
		     }
	}
}

