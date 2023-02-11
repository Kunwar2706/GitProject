     package Array_TestYantra;

public class Findthemulof1st3minNoINArray {

	public static void main(String[]args) {

		int[] a= {5,2,1,3};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}

		}
		
	
	int mul=1;
	int count=3;
	for(int i=0;i<count;i++)
	{
		mul=mul*a[i];
	}
System.out.println("the mul of ist min no "+mul);
}
}
