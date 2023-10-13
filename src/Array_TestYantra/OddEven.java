package Array_TestYantra;

import java.util.Iterator;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a= {2,3,4,5,6};
		int even_count=0;
		int odd_count=0;
	    for (int i = 0; i < a.length; i++) {
			if(a[i]%2==0)
			{
				even_count++;
				System.out.println(a[i]);
			}
			else {
				odd_count++;
			}
		}
			System.out.println("even no is"+even_count);	
		    System.out.println("odd no is:"+odd_count);
	}

}
