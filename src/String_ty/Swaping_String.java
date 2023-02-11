package String_ty;

public class Swaping_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Welcome to Bengluru City";
String[] st = s.split(" ");
		
		String temp=st[0];
		st[0]=st[st.length-1];
			st[st.length-1]	=temp;
			for(int i=0;i<st.length;i++)
			{
				System.out.print(st[i]+" ");
			}
		
	}

}
