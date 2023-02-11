package Java_practice_ty;

public class Reverse_all_char_in_sentences_String {

	public static void main(String[] args) {
String s="Java is a good Programing language";
String st = s.toLowerCase();
String[] s1 = st.split("");
//String rev = "";
for(int i=s1.length-1;i>=0;i--)
{
	System.out.print(s1[i]);
	//rev=rev+s1[i];
}
//System.out.print(rev);
	}

}
