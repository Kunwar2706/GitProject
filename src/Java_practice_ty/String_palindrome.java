package Java_practice_ty;

public class String_palindrome {

	public static void main(String[] args) {
String s="malyalam";
String rev="";
for(int i=s.length()-1;i>=0;i--)
{
	rev=rev+s.charAt(i);
}
if(rev.equals(s))
{
	System.out.println("is palindrome");
}
else
{
	System.out.println(" not apalindrome");
}
	}

}
