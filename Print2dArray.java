
public class Print2dArray {

	public static void main(String[] args) 
	{
		int [][]a= {{1,2,3},
			    {4,5,6},
			    {7,8,9},
			    };
		loop1(0,a);
		
	}
	private static void loop1(int i,int [][]a)
	{
		if(i<a.length)
		{
			jloop(0,a,i);
			System.out.println();
			i++;
			loop1(i,a);
		}
	}
	private static void jloop(int i,int [][]a,int i2)
	{
		if(i<a.length)
		{
			System.out.print(a[i2][i]+" ");
			
			i++;
			jloop(i,a,i2);
		}
	}
}
		
		
		/*
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}*/
