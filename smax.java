
public class smax {

	public static void main(String[] args) 
	{
		int []a= {1,2,3,4,5,6};
		mycode(a);
	}
	private static void mycode(int[] a) 
	{
		int i=0;
		int fmax=Integer.MAX_VALUE;
		int smax=Integer.MIN_VALUE;
		smax=iloop(i,smax,fmax,a);
		System.out.println(smax);
	}
	private static int iloop(int i,int fmax,int smax,int []a)
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
				
		/*int fmax=Integer.MIN_VALUE;
		int smax=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>fmax)
			{
				smax=fmax;
				fmax=a[i];
			}
			if(a[i]>smax && a[i]!=fmax)
				smax=a[i];
		}
		System.out.println(smax);*/
	}


