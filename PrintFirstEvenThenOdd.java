import java.util.Arrays;

public class PrintFirstEvenThenOdd {

	public static void main(String[] args) 
	{

		int[] a = { 11, 22, 33, 44, 55, 66 };
		int []b=new int[a.length];

		int index=0;
		int i1=0;
		index=i1loop(i1,index,a,b);

		int i2=0;
		index=i2loop(i2,index,a,b);
		//System.out.println(index);
		System.out.println(Arrays.toString(b));
		
		int i3=0;
		i3loop(i3,index,b);

	}
	private static int i1loop(int i1, int index, int[] a, int[] b) 
	{
		if(i1<a.length)
		{
			if(a[i1]%2==0)
				b[index++]=a[i1];

			i1++;
			return i1loop(i1,index,a,b);
		}
		return index;
	}
	private static int i2loop(int i2,int index,int []a,int []b)
	{

		if(i2<a.length)
		{
			if(a[i2]%2!=0)
				b[index++]=a[i2];
					
			i2++;
			return i2loop(i2,index,a,b);
		}
		return index;
	}
	private static void i3loop(int i3,int index,int []b)
	{
		if(i3<b.length)
		{
			System.out.print(b[i3]+" ");
			
			i3++;
			i3loop(i3,index,b);
		}
	}
}

/*
int[] a = { 11, 22, 33, 44, 55, 66 };

int[] b = new int[a.length];

int index = 0;
for (int i = 0; i < a.length; i++) 
{
	if (a[i] % 2 == 0) {
		b[index++] = a[i];
	}
}
for (int i = 0; i < a.length; i++) 
{
	if (a[i] % 2 != 0) {
		b[index++] = a[i];
	}
}
for (int i = 0; i < a.length; i++) 
{
	System.out.println(b[i] + " ");
}*/