
public class MultiplicationOf2Daaray {

	public static void main(String[] args) 
	{
		int[][]a= {{1,2,3},{1,2,3},{4,5,6}};
		int[][]b= {{2,2,4},{3,2,5},{5,6,7}};
		
		
		int[][]c=new int[a.length][a[0].length];
		
		int i=0;
		iloop(i,a,b,c);
	}

	private static void iloop(int i, int[][] a, int[][] b, int[][] c) 
	{
		if(i<a.length)
		{
			
		}
	}

	

		
	
	
		
     
	/*	int[][]c=new int[a.length][a[0].length];
		 
		 for(int i=0;i<a.length;i++)
		 {
			 for(int j=0;j<a[0].length;j++)
			 {
				for(int k=0;k<b.length;k++)
				{
					c[i][j]=c[i][j]+a[i][k]*b[k][j];
				}
			 }
		 }
		 for(int i=0;i<a.length;i++)
		 {
			 for(int j=0;j<a.length;j++)
			 {
				 System.out.print(c[i][j]+" ");
			 }
			 System.out.println();
		 }*/

	}

	


