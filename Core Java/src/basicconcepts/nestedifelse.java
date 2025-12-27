package basicconcepts;

public class nestedifelse {
	
	public static void main(String[] args) {
		
		boolean iselectricity=true;
		boolean isswitchon=true;
		
		if(iselectricity==true)
		{
			if(isswitchon==true)
			{
				System.out.println("lights on!!");
			}
			else
			{
				System.out.println("lights off!!");
			}
		}
		else
		{
			System.out.println("No Electricity");
		}
	}
}

