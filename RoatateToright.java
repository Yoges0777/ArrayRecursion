
public class RoatateToright {

	public static void main(String[] args) 
	{
		int []a= {3,2,4,7,8};
		mycode (a);
	}
	private static void mycode(int []a)
	{
		int i=a.length-1;
		int k=0;
		iloop(i,a);
		kloop(k,a);
	}
	private static void iloop(int i,int []a)
	{
		int temp=a[a.length-1];
		if(i>0)
		{
			a[i]=a[i-1];
			i--;
			iloop(i,a);
		}
		a[0]=temp;
	}
	private static void kloop(int k,int []a)
	{
		if(k<a.length)
		{
			System.out.print(a[k]+" ");
			k++;
			kloop(k,a);
			
		}
	}
	/*	int temp=a[a.length-1];
       for(int i=a.length-1;i>0;i--)
       {
    	   a[i]=a[i-1];
       }
       a[0]=temp;
       
       for(int i=0;i<a.length;i++)
       {
    	   System.out.print(a[i]+" ");;
       }*/
	
}
