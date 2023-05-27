
public class transposteMatrix {

	public static void main(String[] args) 
	{
		int [][]a= {{1,2,3},
				{4,5,6},
				{7,8,9},};
		
		loop1(0,a);
	}
	private static void loop1(int i,int [][]a)
	{
		if(i<a.length)
		{
			loop2(0,a,i);
			System.out.println();
			i++;
			loop1(i,a);
		}
	}
	private static void loop2(int j, int[][] a, int i) 
	{
		if(j<a.length)
		{
			System.out.print(a[j][i]+" ");
			
			j++;
			loop2(j,a,i);
		}
		
	}
	

}
