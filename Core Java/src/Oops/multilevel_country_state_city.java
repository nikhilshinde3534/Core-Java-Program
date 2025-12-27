package Oops;

class country
{
	void co_name()
	{
		System.out.println("India");
	}
}

class state extends country
{
	void s_name()
	{
		System.out.println("Maharashtra");
	}
}

class city extends state
{
	void ci_name()
	{
		System.out.println("Pune");
	}
}
public class multilevel_country_state_city {

	public static void main(String[] args) {
		
		city ob=new city();
		ob.co_name();
		ob.s_name();
		ob.ci_name();
	}
}