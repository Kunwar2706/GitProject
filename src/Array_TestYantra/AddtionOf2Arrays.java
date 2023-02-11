 package Array_TestYantra;

public class AddtionOf2Arrays {

	public static void main(String[] args) {
		int[]a= {4,2,3,1,3};
		int[] b= {2,4,1,7};
		int length=a.length;//5
		if(a.length<b.length)//5<4t
		{
			length=b.length;
		}
		for(int i=0;i<a.length;i++)
			//i=0 0<5t
			//i=1 1<5t
			//i=2 2<5t
			//i=3 3<5t
			//i=4 4<5t

		{
			try
			{
				System.out.println(a[i]+b[i]+" ");//4+2=6,2+4=6,
			}
			catch(Exception e) 
			{
				if(a.length<b.length)	
				{
					System.out.println(b[i]);
				}
				else
				{
					System.out.println(a[i]);
				}
			}
		}

	}

}

