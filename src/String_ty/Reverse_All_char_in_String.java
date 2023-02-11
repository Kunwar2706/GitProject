package String_ty;

public class Reverse_All_char_in_String{

	//
	
	public static void main(String[] args) {
		

	String s="Welcome to to Bengaluru Bengaluru";
	String st = s.toLowerCase();
	String[] str=st.split("");
	String rev="";
	for(int i=str.length-1;i>=0;i--)
	{
		rev=rev+str[i]+"";
	}

	System.out.println(rev);
}
}
