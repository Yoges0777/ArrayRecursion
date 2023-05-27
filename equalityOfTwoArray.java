
public class equalityOfTwoArray {

	public static void main(String[] args) 
	{
		int[]a= {10,20,30,40,50};
		int[]b= {10,20,30,40,50,60};
		
		if(a.length==b.length)
		{
			int cnt=0;
			cnt=iloop(0,cnt,a,b);
			if(cnt==0)
			System.out.println("same");
			else
				System.out.println("not same");
		}
		else 
			System.out.println("not same");
	}
	private static int iloop(int i,int cnt,int []a,int []b)
	{
		if(i<a.length)
		{
			if(a[i]!=b[i])
			{
				cnt++;
			}
			i++;
			cnt=iloop(i,cnt,a,b);
		}
		return cnt;
	}
		/*int[]a= {10,20,30,40,50};
		int[]b= {10,20,30,40,50};
		
		if(a.length==b.length)
		{
			int cnt=0;
			for(int i=0;i<a.length;i++)
			{
				if(a[i]!=b[i])
				{
					cnt++;
				}
			}
			if(cnt==0)
				System.out.println("same");
			else
				System.out.println("not same");
				
		}
		else
			System.out.println("not equal");*/
	}


