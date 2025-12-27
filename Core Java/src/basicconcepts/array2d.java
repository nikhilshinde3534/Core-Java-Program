package basicconcepts;

public class array2d {
	public static void main(String[] args) {
		// Two Dimensional Array
		
		int arr[][]= { {10,20},
						{30, 40}
		};
		
		for(int r=0;r<arr.length;r++)
		{
			for(int c=0;c<arr.length;c++)
			{
				System.out.print(arr[r][c]+" ");
			}
			System.out.println();
		}
	}
}


