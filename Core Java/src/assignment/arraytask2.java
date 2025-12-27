package assignment;

public class arraytask2 {
	
	//Print the even number of array
	public static void main(String[] args) {
		
		int arr1[] = {1,2,3,4,5};
		
		System.out.print("Enter the Number :\n");
		
		for(int i=0; i<arr1.length; i++)
		{
			if(arr1[i]%2==0)
			{
				System.out.println( arr1[i]);
			}
		}
	}
}

