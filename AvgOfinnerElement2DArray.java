
public class AvgOfinnerElement2DArray {

	public static void main(String[] args) 
	{
		int [][]a= {
				    {1,2,3,4},
				    {4,4,4,6},
			     	{7,8,8,4},
			     	{7,8,9,7}
				  };
		demo obj=new demo();
		loop1(1,a,obj);	
		System.out.println(obj.sum);
		System.out.println(obj.sum/obj.cnt);
	}
	private static void loop1(int i,int [][]a,demo obj)
	{
		if(i<a.length-1)
		{
			loop2(1,i,a,obj);
			
			i++;
			loop1(i,a,obj);
		}
	}
	private static void loop2(int j,int i,int [][]a,demo obj)
	{
		if(j<a.length-1)
		{
			obj.sum+=a[i][j];
			obj.cnt++;
			j++;
			loop2(j,i,a,obj);
		}
	}
}
class demo
{
	int sum=0;
	int cnt=0;
}
		
		
		
		
		/*int sum=0;
		int cnt=0;
		for(int i=1;i<a.length-1;i++)
		{
			for(int j=1;j<a.length-1;j++)
			{
				sum=sum+a[i][j];
				cnt++;
			}
		}
		System.out.println(sum);
		System.out.println(sum/cnt);*/