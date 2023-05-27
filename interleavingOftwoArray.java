
import java.util.*;
public class interleavingOftwoArray {

	public static void main(String[] args) 
	{
		char []a= {'a','b','c','d','e','f','g','h'};
		char []b= {'i','j','k','l','m','n'};
		
		mycode(a,b);
	}
	private static void mycode(char[] a, char[] b) 
	{
		char []c=new char [a.length + b.length];
		int i=0;
		int index=0;
		c=iloop(i,a,b,c,index);
	  // System.out.print(c);
		print(0,c);
		
	}
	private static void print(int i, char[] c) 
	{
		if(i<c.length)
		{
			System.out.print(c[i]+" ");
			i++;
			print(i,c);
		}
		
	}
	private static char []iloop(int i,char []a,char []b,char []c,int index)
	{
		if(i<a.length || i<b.length)
		{
			if(i<a.length)
				c[index++]=a[i];
			if(i<b.length)
				c[index++]=b[i];
			
			i++;
			return iloop(i,a,b,c,index);
		}
		return c;
	}
	

	
		
		/*int index=0;
		for(int i=0;i<a.length || i<b.length;i++)
		{
			if(i<a.length)
			{
				c[index++]=a[i];
			}
			if(i<b.length)
			{
				c[index++]=b[i];
			}
				
		}
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+" ");
		}*/
	}


