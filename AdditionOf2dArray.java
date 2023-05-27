
public class AdditionOf2dArray {

	public static void main(String[] args) 
	{
		int[][]a= {{1,2,3},{1,2,3},{4,5,6}};
		int[][]b= {{2,2,4},{3,2,5},{5,6,7,1}};

		int[][]c=new int [a.length][a[0].length];

		int i=0;
		iloop(i,a,b,c);
	}
	public static void iloop(int i, int[][] a, int[][] b, int[][] c) 
	{
		if(i<c.length)
		{
			int j=0;
			jloop(i,j,c,a,b);
            System.out.println();
			i++;
			iloop(i,a,b,c);
		}
	}
	private static void jloop(int i, int j, int[][] c, int[][] a, int[][] b) 
	{
		if(j<c.length)
		{
			c[i][j]=a[i][j]+b[i][j];
			System.out.print(c[i][j]+" ");
			j++;
			jloop(i,j,c,a,b);
		}
			
		
	}
}































/*int[][]c= new int [a.length][a[0].length];

		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c.length;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}*/


