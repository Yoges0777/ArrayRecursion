
public class smax1 {

	public static void main(String[] args) 
	{
		int []a= {1,2,3,4,5,6};
		int fmax=Integer.MIN_VALUE;
		int smax=Integer.MIN_VALUE;
         int i=0;
		smax=iloop(i,fmax,smax,a);
		System.out.println(smax);
	}

	private static int iloop(int i, int fmax, int smax, int[] a) 
	{
		if(i<a.length)
		{
			if(a[i]>fmax)
			{
				smax=fmax;
				fmax=a[i];
			}
			if(a[i]>smax && a[i]<fmax)
				smax=a[i];
			i++;
			return iloop(i,fmax,smax,a);
		}
		return smax;
		
	}

}
