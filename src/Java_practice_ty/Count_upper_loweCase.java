package Java_practice_ty;

public class Count_upper_loweCase {

	public static void main(String[] args) {
String s="tesTYantRa";
int uppercase=0;
int lowercase=0;
int count=0;
for(int i=0;i<s.length();i++)
{
	if(s.charAt(i)>='A'&&s.charAt(i)<='Z')
	{
		uppercase++;
	}
	else if (s.charAt(i)>='a'&&s.charAt(i)<='z') 
	{
		lowercase++;
	}
	
}
System.out.println("uppercase "+uppercase);
System.out.println("lowercase "+lowercase);

	}

}
