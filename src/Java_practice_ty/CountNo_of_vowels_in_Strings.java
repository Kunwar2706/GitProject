package Java_practice_ty;

public class CountNo_of_vowels_in_Strings {

	public static void main(String[] args) 
	{
String s="TestYantra";
char[] ch = s.toCharArray();
int count =0;
for(int i=0;i<ch.length;i++)
{
	if(ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U'&& ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
	{
		count++;
	}
	System.out.println(ch[i]+" " +count);
}
	}

}
