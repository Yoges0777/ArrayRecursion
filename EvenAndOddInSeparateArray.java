import java.util.Arrays;

public class EvenAndOddInSeparateArray {

	public static void main(String[] args) 
	{
		int []a= {11,22,33,44,55,66,77,88,99};

		int cnt=0;
		cnt=iloop(0,cnt,a);	
		int []b=new int [cnt];
		int []c=new int [a.length-cnt];
		
		int index=0;
		index=loop2(0,index,a,b);
		System.out.println(Arrays.toString(b));
		
		int index1=0;
		index1=loop3(0,index1,a,c);
		System.out.println(Arrays.toString(c));
		
		loop4(0,b);
		System.out.println();
		loop5(0,c);
	}
	private static void loop5(int i, int[] c) 
	{
		if(i<c.length)
		{
			System.out.print(c[i]+" ");
			i++;
			loop5(i,c);
		}
		
	}
	private static void loop4(int i, int[] b) 
	{
		if(i<b.length)
		{
			System.out.print(b[i]+" ");
			i++;
			loop4(i,b);
		}
		
	}
	private static int loop3(int i, int index1, int[] a, int[] c) 
	{
		if(i<a.length)
		{
			if(a[i]%2!=0)
				c[index1++]=a[i];
			i++;
			return loop3(i,index1,a,c);
		}
		return index1;
	}
	private static int  loop2(int i, int index, int[] a, int[] b) 
	{
		if(i<a.length)
		{
			if(a[i]%2==0)
				b[index++]=a[i];
			
			i++;
			return loop2(i,index,a,b);
		}
		return index;
		
	}
	private static int iloop(int i, int cnt, int[] a) 
	{
		if(i<a.length)
		{
			if(a[i]%2==0)
				cnt++;
			i++;
			return iloop(i,cnt,a);
		}
		return cnt;
	}
}



/*int cnt=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
				cnt++;

		}
		int []b=new int[cnt];
		int []c=new int[a.length-cnt];

		int index=0;
		int index1=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
				b[index++]=a[i];
		}
		for(int i=0;i<a.length;i++)
		{
		   if(a[i]%2!=0)
		   c[index1++]=a[i];
		}		
		for(int i=0;i<b.length;i++)
			System.out.print(b[i]+" ");
		System.out.println();
		for(int i=0;i<c.length;i++)
			System.out.print(c[i]+" ");*/


