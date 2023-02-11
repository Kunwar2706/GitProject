package Java_practice_ty;

public class Count_NoOf_Vowels {

	public static void main(String[] args) {
String s="TestYantra";
char[] st = s.toCharArray();
int count=0;
for(int i=0;i<st.length;i++)///a,e a
{
	if(st[i]=='a'||st[i]=='e'||st[i]=='i'||st[i]=='o'||st[i]=='u')
	{
		count++;
		System.out.print(st[i]+"");
	}
	
}
System.out.print(count+"");
	}

}
