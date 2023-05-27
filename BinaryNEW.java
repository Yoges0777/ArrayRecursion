
public class BinaryNEW {

	public static void main(String[] args) 
	{
		
		// TODO Auto-generated method stub
				int []a= {23,45,87,88,90};
				//0   1  2  3  4  5  6  7  8
				int num=91;
				int start=0;
				int end=a.length-1;
				int mid=(start+end)/2;
				loop1(start,end,mid,num,a);
			}
			private static void loop1(int start,int end,int mid,int num,int []a)
			{if(start>end)
			{
				System.out.println("index not found");
				
			}
				if(start<=end)
				{
					if(num==a[mid])
					{
						System.out.println("found at index "+mid);
						return ;
					}
					else if(num>mid)
					{
						start=mid+1;
					}
					else
					{
						end=mid-1;
					}
					mid=(start+end)/2;
					
					loop1(start,end,mid,num,a);
				}
				
			}
}