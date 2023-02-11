package String_ty;

public class SumOfDigit_In_String {

	public static void main(String[] args) {
		String s="b2v4d6";//12
		int sum=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				int n=s.charAt(i)-48;
				sum=sum+n;
			}
		}
	 	System.out.println(sum);
	}

}
