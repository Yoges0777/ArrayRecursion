import java.util.Arrays;

public class RemoveSpeceficElement {

	public static void main(String[] args) 
	{
		int []a= {1,2,3,4,5,6};
		int ele=3;
		int cnt=0;
		cnt=loop1(0,a,ele,cnt);
		//System.out.println(cnt);
		int []b=new int[cnt];
		int index=0;
		index=loop2(0,index,a,b,ele);
		System.out.println(Arrays.toString(b));
		
		loop3(0,b);
	}
	private static void loop3(int i,int[]b)
	{
		if(i<b.length)
		{
			System.out.print(b[i]+ " ");
			
			i++;
			loop3(i,b);
		}
	}
	private static int loop2(int i,int index,int []a,int []b,int ele)
	{
		if(i<a.length)
		{
			if(a[i]!=ele)
				b[index++]=a[i];
			
			i++;
			return loop2(i,index,a,b,ele);
		}
		return index;
	}

	private static int loop1(int i, int[] a, int ele,int cnt) 
	{
		if(i<a.length)
		{
		   if(a[i]!=ele)
			   cnt++;
		   i++;
		   return loop1(i,a,ele,cnt);
		}
		return cnt;
	}
}
		/*int cnt=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=ele)
			{
				cnt++;
			}
		}
		int []b=new int[cnt];
		int index=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=ele)
			{
				b[index++]=a[i];
			}
		}
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+" ");
		}*/
