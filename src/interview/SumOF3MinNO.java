package interview;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class SumOF3MinNO {

	public static void main(String[] args) throws Throwable {
		int[] a= {7,-6,11,9,0,4};
		int temp;
		for (int i = 0; i < a.length; i++) 
		{   
			for (int j = i+1; j < a.length; j++) {
				if(	a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}



			}

		}
		int sum=0;
		int count=3;
		for (int i = 0; i <count; i++) {
			sum=sum+a[i];


		}
		System.out.println(sum);
		System.out.println(InetAddress.getLocalHost());
	}

}
