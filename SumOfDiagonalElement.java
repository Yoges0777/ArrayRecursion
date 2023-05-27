
public class SumOfDiagonalElement {

	public static void main(String[] args) 
	{
		int[][] a= {{1,2,3},
				    {4,5,6},
				    {7,8,9}};

	           int sum=0;
	           int cnt=0;
	           int i=0;
	           int []ra=new int [2];
	         ra=  iloop(i,sum,cnt,a,ra);
	         System.out.println(ra[0]);
	         System.out.println(ra[1]);
	}

	private static int[] iloop(int i, int sum, int cnt,int [][]a,int []ra) 
	{
		if(i<a.length)
		{
			int j=0;
			jloop(j,i,sum,cnt,a,ra);
			
			i++;
			return iloop(i,sum,cnt,a,ra);
		}
		return ra;
	}

	private static int [] jloop(int j, int i, int sum, int cnt,int [][]a,int []ra) 
	{
		if(j<a.length)
		{
			if(j+i==a.length-1)
			{
				sum=sum+a[i][j];
				cnt++;
				ra[0]=sum;
				ra[1]=cnt;
			
				j++;
				return jloop(j,i,sum,cnt,a,ra);
			}
			
		}
		return ra;
		
	}
}





/*int[][] a= {{1,2,3},
				{4,5,6},
				{7,8,9}};

		int cnt=0;
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(j+i==a.length-1)
				{
					sum=sum+a[i][j];
					cnt++;
				}
			}
		}
		System.out.println(sum);
		System.out.println(sum/cnt);*/






