
public class FirstMAx {

	public static void main(String[] args) 
	{

		int []a= {1,2,3,4,5,6};
		int fmax=Integer.MIN_VALUE;

		int i=0;
		fmax=iloop(i,a,fmax);
		System.out.println(fmax);
	}
	private static int iloop(int i,int []a,int fmax)
	{
		if(i<a.length)
		{
			if(a[i]>fmax)
			{
				fmax=a[i];
			}
			i++;
			return iloop(i,a,fmax);
		}
		return fmax;
	}



	/*int fmax=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>fmax)
			{
				fmax=a[i];

			}
		}
		System.out.println(fmax);*/


}


