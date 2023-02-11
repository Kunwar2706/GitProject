package Array_TestYantra;

public class Find1stAnd2ndMinArrayWithoutBB {
public static void main(String[]args) {
	
		int[] a= {0,5,1,4};
		int fmin=a[0];// 0 0
		int smin=a[0];// 0  5
		for(int i=0;i<a.length;i++)
			//i=0 0<4t a[i]=0
			//i=1 0<4t a[i]=5
			//i=2 0<4t a[i]=1
			//i=3 0<4t a[i]=4
			//i=4 0<4f terminate
			
		{
			if(a[i]<=fmin)//0<=0t 5<=0f 1<=0f 4<=0f  //(for max change the sign (>))
			{
				if(a[i]!=fmin)
			{
					
				smin=fmin;
 				
			}
			fmin=a[i];//0;
		}
			else if(fmin==smin||smin>a[i])// 0==0t || 0>5, 0==5||5>1t, 0==1||0>4f //(for maximum <)
			{
				smin=a[i];// 5 1
			}
		
}
	System.out.println(fmin+" "+smin);// 0 1
	
	}



}


