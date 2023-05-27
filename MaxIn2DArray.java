
public class MaxIn2DArray {

	public static void main(String[] args) 
	{
		int [][]a= {
				    {1,2,3},
				    {4,5,6},
				    {7,8,9},
		           };
		int i=0;
		int fmax=Integer.MIN_VALUE;
		fmax=iloop(i,a,fmax);
		System.out.println(fmax);
	}
	private static int iloop(int i,int[][]a,int fmax)
	{
		if(i<a.length)
		{
			int j=0;
			jloop(i,j,a,fmax);
			fmax=jloop(i,j,a,fmax);
			i++;
			return iloop(i,a,fmax);
		}
		return fmax;
	}
	private static int jloop(int i,int j,int[][]a,int fmax )
	{
		
		if(j<a.length)
		{
			if(a[i][j]>fmax)
			{
				fmax=a[i][j];
			}
			j++;
			return jloop(i,j,a,fmax);
		}
		return fmax;
		
	}
		
		/*int fmax=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i][j]>fmax)
				{
					fmax=a[i][j];
				}
			}
		}
		System.out.println(fmax);*/
	}


