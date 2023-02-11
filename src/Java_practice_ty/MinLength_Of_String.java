package Java_practice_ty;

public class MinLength_Of_String {

	public static void main(String[] args) {
String[] s={"ab","dv","abcdeg","aaaaaa"};
String min_length = s[0];
for(int i=0;i<s.length;i++)
{
	if(min_length.length()>s[i].length())
	{
		min_length=s[i];
	}
	
}
	for(int i=0;i<s.length;i++)
	{
    if(min_length.length()==s[i].length())
    {
    	System.out.println(s[i]);
	}

}
}
}
