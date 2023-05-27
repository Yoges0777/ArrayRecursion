
public class FindEvenOddPositiveNegativeCnt {

	public static void main(String[] args) 
	{
		int []a= {11,22,33,44,55,66,77,88,-1};

		int x=0;
		int y=0;
		int z=0;
		int z1=0;
		int i=0;
		int []a2=new int[4];
		a2=iloop(i,x,y,z,z1,a, a2);
		System.out.println(a2[0]);
		System.out.println(a2[2]);
		System.out.println(a2[2]);
		System.out.println(a2[3]);

	}
	private static int[] iloop(int i,int x,int y,int z,int z1,int []a,int[]a2)
	{
		if(i<a.length)
		{
			if(a[i]%2==0)
			{
				x++;
				a2[0]=x;
			}
			else
			{
				y++;
				a2[1]=y;
			}
			if(a[i]>0)
			{
				z++;
				a2[2]=z;
			}
			else 
			{
				z1++;
				a2[3]=z1;
			}
			i++;
			iloop(i, x, y, z, z1, a, a2);
		}
		return a2;	


	}


}



