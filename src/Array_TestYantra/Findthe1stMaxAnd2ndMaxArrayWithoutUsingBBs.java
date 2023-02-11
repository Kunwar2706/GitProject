package Array_TestYantra;

public class Findthe1stMaxAnd2ndMaxArrayWithoutUsingBBs {

	public static void main(String[] args) {
	int[] a= {5,0,5,1,4};
	int fmax=a[0];
	int smax=a[0];
	for(int i=0;i<a.length;i++)
	{
		if(a[i]>=fmax)
		{
			
				if(a[i]!=fmax) {
					
				smax=fmax;
				
			}
			fmax=a[i];
		}
			else if(fmax==smax||smax<a[i])
			{
				smax=a[i];//
			}
		
}
	System.out.println(fmax+" "+smax);// 
	
		
	
	}

}
