
public class InsertionSort {

	public static void main(String[] args) 
	{
		int []a= {33,5,3,4,44,56,88,13,55,67};
		
		loop1(1,a);
		loop3(0,a);
	}
	private static void loop3(int i, int[] a) 
	{
		if(i<a.length)
		{
			System.out.print(a[i]+" ");
			
			i++;
			loop3(i,a);
		}
	}
	private static void loop1(int i,int []a)
	{
		if(i<a.length)
		{
			int temp=a[i];
			int j=i;
			loop2(j,temp,a);
			
			i++;
			loop1(i,a);
		}
	}
	private static void loop2(int j,int temp,int []a)
	{
		if(j>0 && a[j-1]>temp)
		{
			a[j]=a[j-1];
			
		
		j=j-1;
		a[j]=temp;
	    loop2(j,temp,a);
		
		}
		
	}

}