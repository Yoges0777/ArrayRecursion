
public class IndexOF {

	public static void main(String[] args) 
	{
		int []a= {1,2,3,4,5,6};
		int ele=6;
		mycode(a,ele);
	}
	private static void mycode(int[] a,int ele) 
	{
		int i=0;
		int cnt=0;
		cnt=iloop(i,cnt,a,ele);
		System.out.println(cnt);
	}
	private static int iloop(int i,int cnt,int []a,int ele)
	{
		if(i<a.length)
		{
			if(a[i]==ele)
			{
				System.out.println("index of ele "+i);
				cnt++;
			}
			i++;
			return iloop(i,cnt,a,ele);
		}
		return cnt;
	}
		/*int cnt=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==ele)
			System.out.println(i);
			cnt++;
		}
		if(cnt==0)
			System.out.println("not found");
		*/
	}


