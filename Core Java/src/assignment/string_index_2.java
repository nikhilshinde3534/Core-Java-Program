package assignment;

public class string_index_2 {

	public static void main(String[] args) {
		
		String s="Cravita";
		
		char ch='v';
		
		char a[]=s.toCharArray(); // c,r,a,v,i,t,a
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i]==ch)
			{
				System.out.println(i);
			}
		}
	}
}
