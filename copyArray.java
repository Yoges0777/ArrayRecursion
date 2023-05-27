
public class copyArray {

	public static void main(String[] args) {

		int []a= {1,2,3,4,5};
		int index=0;
		int[]b= new int[a.length];
		copyarray(a,index,b);	
	}

	private static void copyarray(int[] a, int index, int[] b)
	{
		int i=0;
		iloop(i,a,b);
	}
	private static void iloop(int i, int[] a, int[] b) 
	{
		if(i<a.length)
			b[i]=a[i];
		System.out.print(b[i]+" ");
		i++;
		iloop(i,a,b);
	}

}
