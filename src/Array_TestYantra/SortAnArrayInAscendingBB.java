  package Array_TestYantra;

public class SortAnArrayInAscendingBB {

	public static void main(String[] args) 
	{
		int[]a= {5,2,1,3};//1 5 2 3,1 2 5 3 ,1,2,3,5
		for(int i=0;i<a.length;i++)
		{
			//i=0 0<4t a[i]=5
			//i=1 0<4t  a[i]=2
			//i=2 0<4t   a[i]=1
			//i=3 0<4t    a[i]=	3

			for(int j=i+1;j<a.length;j++)
				//j=3+1=4 terminate
			{
				if(a[i]>a[j]) //5>2T,2>1t,1>3f,5>2t,2>3f,5>3t
				{
					int temp=a[i];//temp=5 2  5 5
					a[i]=a[j];//a[i]=2     1  2 3
					a[j]=temp;//a[j]=5    2   5 5

				}
			}

		}
		for(int k=0;k<a.length;k++)
		{
			System.out.println(a[k]+"");
		}
	}
}


