package String_ty;

public class Reverse_Each_CharOfTheWord_In_String {

	public static void main(String[] args) {
		String s="Welcome to Bengaluru";
		String[] str = s.split(" ");
		for(int i=0;i<str.length;i++)
		{
			String st=str[i];
			for(int j=st.length()-1;j>=0;j--)
			{
				System.out.print(st.charAt(j));
			}
			System.out.print(" ");
		}
		

	}

}
