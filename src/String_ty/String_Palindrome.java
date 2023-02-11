package String_ty;

public class String_Palindrome {

	public static void main(String[] args) {
	String s="malayalam";
	String rev="";
	for(int i=s.length()-1;i>=0;i--)
	{
		rev=rev+s.charAt(i);
	}
	if(rev.equals(s))
	{
		System.out.println(" is palindome");
	}
	else
	{
		System.out.println("is not plaindrome");
	}

	}

}
