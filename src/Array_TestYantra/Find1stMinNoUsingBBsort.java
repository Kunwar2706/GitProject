 package Array_TestYantra;

public class Find1stMinNoUsingBBsort {

	public static void main(String[] args)
	{
		int a[]= {5,2,1,3};
 		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])//changing the sign of operater we get max
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}

		}
		System.out.println("1 st min no is "+a[0]);
		

	}

}
