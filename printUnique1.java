
public class printUnique1 {

	public static void main(String[] args) 
	{
		int []a= {1,2,3,4,5,6};
		mycode(a);
	}
	private static void mycode(int[] a) 
	{
		int i=0;
		
	    iloop(i,a);
	}
	private static void  iloop(int i,int []a)
	{
		if(i<a.length)
		{
			int j=0;
			int cnt=0;
			cnt=jloop(i,j,cnt,a);
			System.out.print(a[i]);
			i++;
			iloop(i,a);
		}
	}
	private static int jloop(int i,int j,int cnt,int []a)
	{
		if(j<i)
		{
			if(a[i]==a[j])
				cnt++;
			j++;
			return jloop(i,j,cnt,a);
		}
		return cnt;
	}
		/*for(int i=0;i<a.length;i++)
		{
			int cnt=0;
			for(int j=0;j<i;j++)
			{
				if(a[i]==a[j])
					cnt++;
			}
			if(cnt==0)
				System.out.print(a[i]);				
		}*/

	}

