
public class AvgOfouterElementIn2darray
{

	public static void main(String[] args) 
	{
		int [][]a= {
				    {1,2,3},
				    {4,5,6},
			     	{7,8,8}
				   };
		  Yogesh objj=new Yogesh();
		   loop1(0,a,objj);	
		   System.out.println(objj.sum);
		   System.out.println(objj.sum/objj.cnt);
	}
	private static void loop1(int i,int [][]a,Yogesh objj)
	{
		if(i<a.length)
		{
			loop2(0,a,i,objj);
			
			i++;
			loop1(i,a,objj);
		}
	}
	private static void loop2(int j,int [][]a,int i,Yogesh objj)
	{
		if(j<a.length)
		{
			if(i==0 || j==0 || i==a.length-1 || j==a.length-1 )
			{
				objj.sum+=a[i][j];
				objj.cnt++;
			}
			j++;
			loop2(j,a,i,objj);
		}
	}

}
class Yogesh
{
	int sum=0;
	int cnt=0;
}