package Array_TestYantra;

public class FindThe1stMinArraywithoutBB {

	public static void main(String[] args) {
	int[] a= {5,2,1,3};// o/p=1
	int fmin=a[0];//5 2 1
	for(int i=0;i<a.length;i++)

		//i=1 1<4t a[i]=2
		//i=2 2<4t a[i]=1
		//i=3 3<4t a[i]=3
		//i=4 4<4f terminate
	{
		if(fmin>a[i])//5>2T 2>1T 1>3f
		{
			fmin=a[i];// 2 1
		}
	}
	System.out.println("1st st min no in the arr "+fmin);

	}

}
