 package NumberSystem_ty;

public class Ptr14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

//		 5 4 3 2 1 
//		  5 4 3 2 
//		   5 4 3 
//		    5 4 
//		     5 		
	

		int n=5;

		for(int i=1;i<=n;i++)
		{
			int k=5;
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int j=i;j<=n;j++)
			{
				System.out.print(k--+" ");
			}
			System.out.println();
			
		}
		
	

}
}
