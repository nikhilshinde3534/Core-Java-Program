package Collection_Framework;

import java.util.ArrayList;

public class task_1 {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add(45);
		al.add("Nikhil");
		int flag=0;
		
		for(int i=0;i<al.size();i++)
		{
			if(al.get(i).equals("Nikhil"))
			{
				flag++;
			}
		}
		if(flag==0)
		{
			System.out.println("Nikhil object does not exist....!");
		}
		else
		{
			System.out.println("Nikhil object exist....!");
		}
	}
}


