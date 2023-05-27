
public class FindSpeceficElement {

	public static void main(String[] args) 
	{
		
		int []a= {1,2,3,4,5,6};
		int ele=7;
		mycode(a,ele);
	}
	private static void mycode(int[] a, int ele) 
	{
		int i=0;
		int cnt=0;
		cnt=iloop(i,cnt,ele,a);
		if(cnt!=0)
			System.out.println("found");
		else
			System.out.println("not found");
	}
	private static int iloop(int i,int cnt,int ele,int []a)
	{
		if(i<a.length)
		{
			if(a[i]==ele)
			{
				cnt++;
			}
			i++;
			return iloop(i,cnt,ele,a);
		}
		return cnt;
	}
		/*int cnt=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==ele)
			{
				cnt++;
			}
		}
		if(cnt!=0)
			System.out.print("found");
		else
			System.out.print("not found");
			*/
	}


