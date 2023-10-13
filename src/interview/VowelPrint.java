  package interview;

public class VowelPrint {

	public static void main(String[] args) {
String s="education";
char[] ch = s.toCharArray();
String vowel=" ";
String conso=" ";
for (int i = 0; i < ch.length; i++) 
{
	if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
	
		vowel=vowel+ch[i];
	else
		 conso=conso+ch[i];
}
System.out.println(vowel);
System.out.println(conso);
	}

}
