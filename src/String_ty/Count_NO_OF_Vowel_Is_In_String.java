package String_ty;

public class Count_NO_OF_Vowel_Is_In_String {

	public static void main(String[] args) {
String s="testYantra";//aea=3
char[] st = s.toCharArray();
int count=0;
for(int i=0;i<st.length;i++) {
	if(st[i]=='a'||st[i]=='e'||st[i]=='i'||st[i]=='o'||st[i]=='u')
	{
		count++;
		System.out.print(st[i]);
	}
	
}
System.out.println(count+" ");
	}

}
