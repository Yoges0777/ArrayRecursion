
public class UniquePair1 {

	public static void main(String[] args) 
	{
		int[]a= {1,2,3,2};
		int unt=0;
		
		unt=loop1(0,unt,a);
		//System.out.println(unt);
		int []b=new int[unt];
		int index=0;
		loop3(0,index,b,a);
		
		loop5(0,b);
	}

	private static void loop5(int i, int[] b) 
	{
		if(i<b.length)
		{
			loop6(0,b,i);
			
			
			i++;
			loop5(i,b);
		}
	}

	private static void loop6(int j, int[] b,int i) 
	{
		if(j<b.length)
		{
			System.out.println(b[i]+" "+b[j]);
			j++;
			loop6(j,b,i);
		}
		
	}

	private static void loop3(int i, int index, int[] b, int[] a) 
	{
		if(i<a.length)
		{
			int cnt=0;
			cnt=loop4(0,i,a,cnt);
			if(cnt==0)
			{
				b[index++]=a[i];
			}
			
			i++;
			loop3(i,index,b,a);
		}
		
	}

	private static int loop4(int j, int i, int[] a,int cnt) 
	{
		if(j<i)
		{
			if(a[i]==a[j])
			{
				cnt++;
			}
			j++;
			return loop4(j,i,a,cnt);
		}
		return cnt;
		
	}

	private static int loop1(int i, int unt, int[] a) 
	{
		if(i<a.length)
		{
			int cnt=0;
			
			cnt=loop2(0,i,cnt,a);
			if(cnt==0)
			{
				unt++;
			}
			
			i++;
			return loop1(i,unt,a);
		}
		return unt;
		
	}
	private static int loop2(int j,int i,int cnt, int[] a) 
	{
		if(j<i)
		{
			if(a[i]==a[j])
			{
				cnt++;
			}
			
			j++;
			return loop2(j,i,cnt,a);
		}
		return cnt;
	}

}
