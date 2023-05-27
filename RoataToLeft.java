
public class RoataToLeft {

	public static void main(String[] args) 
	{
		int []a= {3,2,4,7,8};
		mycode(a);
	}
	private static void mycode(int[] a) 
	{
		int i=0;
	    iloop(i,a);
	    ploop(i,a);
	    
	}
	private static void iloop(int i,int[]a)
	{
		int temp=a[0];
		if(i<a.length-1)
		{
			a[i]=a[i+1];
			i++;
			iloop(i,a);
		}
		a[a.length-1]=temp;
	}
	private static void ploop(int i,int[]a)
	{
		if(i<a.length)
		{
			System.out.print(a[i]+" ");
			i++;
			ploop(i,a);
		}
	}
	/*
		int temp=a[0];
		for(int i=0;i<a.length-1;i++)
		{
			a[i]=a[i+1];
		}
		a[a.length-1]=temp;
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}*/

}
