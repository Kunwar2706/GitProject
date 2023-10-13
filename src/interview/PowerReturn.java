package interview;

public class PowerReturn {
	
	
	    
	  public static  int getPrime(int n)
	    {
	    
	   int count=0;
	   for (int i=1; i<=n;i++ ) 
	   {
	       if(n%i==0)
	       {
	           count++;
	       }
	   }
	   return count;
	    }
	    public static void main (String[] args) {
	        /* code */
	    int n=9;
	  int pmNO=getPrime(n);
	   if(pmNO==2)
	   {
	       System.out.println(" is a prime no");
	   }
	   else
	   {
	       System.out.println(" is not a prime no");
	   }
	   
		}
		    
			
		
	}


