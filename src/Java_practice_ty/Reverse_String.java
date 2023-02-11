package Java_practice_ty;

public class Reverse_String {

	public static void main(String[] args) {
String s="java";
char[] st = s.toCharArray();
for(int i=st.length-1;i>=0;i--)
{
	System.out.print(st[i]);
}
System.out.println();

System.out.println("=============================");
String s2="radha";
for(int i=s2.length()-1;i>=0;i--)
{
	System.out.print(s2.charAt(i));
}

System.out.println();
System.out.println("============================3rd way====");
String s3="Amit";
String rev = "";
for(int i=s3.length()-1;i>=0;i--)
{
	rev=rev+s3.charAt(i);
}
System.out.println(rev);

System.out.println();
System.out.println("===4th way ===");
	
	String s4="Kunwar";
	StringBuilder sb=new StringBuilder(s4);
			System.out.println(sb.reverse());
	}
}
