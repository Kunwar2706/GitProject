package NumberSystem_ty;

public class Ptr15 {
//	1 1 1 1 1 
//	2 2 2 2 2 
//	1 1 1 1 1 
//	2 2 2 2 2 
//	1 1 1 1 1 


	public static void main(String[] args) {
		int n=5;

		for(int i=1;i<=n;i++)
		{

			for(int j=1;j<=n;j++)
			{
				if(i%2==0) {
					System.out.print("2 ");
				}
				else {
					System.out.print("1 ");
				}
			}

			System.out.println();
		}

		
	
}
}

