package Array_TestYantra;

public class FindThe1stmaxArraywithoutBB2 {
	public static void main(String[] args) {
		int[] a= {5,2,1,3};// o/p=5
		int fmax=a[0];//5 2 1
		for(int i=0;i<a.length;i++)

			//i=1 1<4t a[i]=2
			//i=2 2<4t a[i]=1
			//i=3 3<4t a[i]=3
			//i=4 4<4f terminate
		{
			if(fmax<a[i])//5>2T 2>1T 1>3f
			{
				fmax=a[i];// 2 1
			}
		}
		System.out.println("1st st max no in the arr "+fmax);

	}

}
