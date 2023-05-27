import java.util.Arrays;
import java.util.Iterator;

public class AAAA {

	public static void main(String[] args) 
	{
		int []a= {11,22,33,44,55,55};
		int cnt=0;
		cnt=loop1(0,a,cnt);
		System.out.println(cnt);
		int[]b=new int[a.length-cnt];
		int index=0;
		loop3(0,a,b,index);
		System.out.println(Arrays.toString(b));
		
		loop5(0,b);
	}

	private static void loop5(int i, int[] b) 
	{
		if(i<b.length)
		{
			loop6(0,i,b);
			
			i++;
			loop5(i,b);
		}
	}

	private static void loop6(int j, int i, int[] b) 
	{
		if(j<b.length)
		{
			if(j<b.length)
			{
				System.out.println(b[i]+" "+b[j]);
			}
			
			j++;
			loop6(j,i,b);
		}
	}

	private static void loop3(int i,int []a,int []b,int index)
	{
		if(i<a.length)
		{
			int cnt=0;
			cnt=loop4(0,i,a,b,index,cnt);
			if(cnt==0)
			{
				b[index++]=a[i];
			}
			i++;
			loop3(i,a,b,index);
		}
	}
	private static int  loop4(int j,int i,int[]a,int []b,int index ,int cnt)
	{
		if(j<i)
		{
			if(a[i]==a[j])
			{
				cnt++;
			}
			j++;
			return loop4(j,i,a,b,index,cnt);
		}
		return cnt;
	}
	private static int  loop1(int i, int[] a,int cnt) 
	{
		if(i<a.length)
		{		
			cnt=loop2(0,i,a,cnt);
			
			i++;
			return loop1(i,a,cnt);
		}
		return cnt;
	}
	private static int loop2(int j, int i, int[] a,int cnt) 
	{
		if(j<i)
		{
			if(a[i]==a[j])
				cnt++;
			
			j++;
			return loop2(j,i,a,cnt);
		}
		return cnt;
		
	}

}
