package basicconcepts;

public class array2dnew {
	public static void main(String[] args) {
		
		long num[][]= new long[2][2];
		num[0][0]=56;
		num[0][1]=42;
		num[1][0]=36;
		num[1][1]=48;
		
		for(int r=0;r<num.length;r++)
		{
			for(int c=0;c<num.length;c++)
			{
				System.out.print(num[r][c]+" ");
			}
			System.out.println();
		}
	}
}

