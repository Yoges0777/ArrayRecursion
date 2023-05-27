
public class replace {

	public static void main(String[] args) 
	{
		int []a= {1,0,1,0,1,2,0,1,};
		int i=0;
		int k=0;
		iloop(i,a);
		kloop(k,a);
	}
	private static void iloop(int i,int []a)
	{
		if(i<a.length)
		{
          if(a[i]==0)
          {
        	  a[i]=1;
          }
          i++;
          iloop(i,a);
		}
	}
	private static void kloop(int k,int[]a)
	{
		if(k<a.length)
		{
			System.out.print(a[k]+" ");
			k++;
			kloop(k,a);
		}
	}	
}


