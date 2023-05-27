
public class SaddlePoint {

	public static void main(String[] args) 
	{
		int[][]a=       {
				{6,3,1},
				{9,7,8},
				{2,4,5}
		};

		//int cnt=0;
		int i=0;
		int cnt=0;
		cnt=iloop(i,a,cnt);
		
		if(cnt==0)
		{
			System.out.println("no saddle point");
		}
	}

	private static int iloop(int i, int [][]a,int cnt) 
	{
		if(i<a.length)
		{
			int j=0;
			
		cnt=	jloop(j,i,a,cnt);
			
			i++;
			return iloop(i,a,cnt);
		}
		return cnt;
	
	}

	private static int jloop(int j, int i,int [][]a,int cnt) 
	{
		if(j<a.length)
		{
			int s=0;
			int k=0;
			s=kloop(k,s,a,i,j);
			int k1=0;
			int l=0;
			l=k1loop(k1,i,j,a,l);
			
			if(s==0 && l==0)
			{
				System.out.println(a[i][j]);
				cnt++;      
			}
			j++;
			return jloop(j,i,a,cnt);
		}
		return cnt;
	}

	
	private static int k1loop(int k1, int i, int j, int[][] a,int l) 
	{
		if(k1<a.length)
		{
		  if(a[i][j]<a[k1][j])	
		  {
			  l++;
		  }
		  k1++;
		  return k1loop(k1,i,j,a,l);
		}
		return l;
	}

	private static int  kloop(int k, int s, int[][] a,int i,int j) 
	{
		if(k<a.length)
		{
			if(a[i][j]>a[i][k])
			{
				s++;
			}
			k++;
			return kloop(k,s,a,i,j);
		}
		return s;
	}

	

}
/*
		int cnt=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				int s=0;
				for(int k=0;k<a.length;k++)
				{
					if(a[i][j]>a[i][k])
					{
						s++;
					}
				}
				int l=0;
				for(int k=0;k<a.length;k++)
				{
					if(a[i][j]<a[k][j])
					{
						l++;
					}
				}
				if(s==0 && l==0)
				{
					System.out.println(a[i][j]);
					cnt++;
				}
			}
		}
		if(cnt==0)
		{
			System.out.println("no saddle poin");
		}
	}*/


