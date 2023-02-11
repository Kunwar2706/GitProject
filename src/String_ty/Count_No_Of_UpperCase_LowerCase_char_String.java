 package String_ty;

public class Count_No_Of_UpperCase_LowerCase_char_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="TesTYaNtRa";
		//upercase=5;
		//lowercase=5;
		int uppercase=0;
		int lowercase=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='A' && s.charAt(i)<='Z')
			{
				uppercase++;
			}
			else if(s.charAt(i)>='a' && s.charAt(i)<='z')
			{
				lowercase++;
			}
		}
		System.out.println("uppercase " +uppercase);
		System.out.println("lowercase " +uppercase);
	}

}
