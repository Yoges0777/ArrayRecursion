
public class sumAndavg {

	public static void main(String[] args) 
	{
		int []a= {1,2,3,4,5,6,8,9};
		mycode(a);
	}

	private static void mycode(int[] a) 
	{
		int i=0;
		int sum=0;
		System.out.println(arraysum(a,i,sum));
		double avg=arraysum(a,i,sum)/a.length;
		System.out.println(avg);
	}

	private static int arraysum(int[]a, int i, int sum) 
    {
		{
			if(i<a.length)
			{
				sum=sum+a[i];
				i++;
				return arraysum(a,i,sum);
			}
			else
				return sum;
		}
	}

}
