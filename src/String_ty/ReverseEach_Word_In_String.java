package String_ty;

public class ReverseEach_Word_In_String {

	public static void main(String[] args) {
String s="Welcome to Bengaluru";

String[] str=s.split(" ");
for(int i=str.length-1;i>=0;i--)
{
	System.out.print(str[i]+" ");
}
	}

}
