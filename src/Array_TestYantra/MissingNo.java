package Array_TestYantra;

public class MissingNo {

	public static void main(String[] args) {
		int a[]= {1,2,4,5,6,7};
		int sum1=0;
		int sum2=0;
		int m=0;
		for (int i = 0; i < a.length; i++)
		{
			sum1=sum1+a[i];   
		}
		
		for (int i = 1; i<=7; i++) 
		{
			sum2=sum2+i;
		}
		
		m=(sum2-sum1);
System.out.println(m);
	}

}
