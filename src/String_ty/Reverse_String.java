package String_ty;

public class Reverse_String {

	public static void main(String[] args) {
//		String s="TestYantra";
//		for(int i=s.length()-1;i>=0;i--)
//		{
//			System.out.println(s.charAt(i));
//		}
		
		//2
		String s="testYantra";
		char[] st = s.toCharArray();
		for(int i=st.length-1;i>=0;i--)
		{
			System.out.print(st[i]);
		}
//		
//		//3
//
//		String s="TestYantra";
//		String rev="";
//		for(int i=s.length()-1;i>=0;i--)
//		{
//			rev=rev+s.charAt(i);
//		}
//		System.out.println(rev);
		
	//4	
//		String s="Testyantra";
//		char[] ch = s.toCharArray();
//		int count=0;
//		for(char c:ch) 
//		{
//			count++;
//		}
//		for(int i=count-1;i>=0;i--)
//		{
//			System.out.println(ch[i]);
//		}
		
//		//5
//		StringBuilder s=new StringBuilder("TestYantra");
//		System.out.println(s.reverse());
//		
	}

}
