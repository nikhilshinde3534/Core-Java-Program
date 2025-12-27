package Collection_Framework;

import java.util.ArrayList;

public class task_2 {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add(45);
		al.add("y");
		al.add("Pune");
		al.add(45.6);
		al.add(98747290474635383l);
		
		for(int i=0; i<al.size();i++)
		{
			if(i==3)
			{
				al.add(i, 78923.23);
			}
		}
		System.out.println("ArrayList is : "+al);
	}
}

