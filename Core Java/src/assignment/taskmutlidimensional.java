package assignment;

public class taskmutlidimensional {
	// Multidimensional Array
	public static void main(String[] args) {
		
		int a [][][] = { { {1,2},
						   {3,4}},
						 { {5,6},
						   {7,8}} };
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				for(int k=0;k<a.length;k++)
				{
					System.out.print(a[i][j][k] +" ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}

