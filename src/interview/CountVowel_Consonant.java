package interview;

public class CountVowel_Consonant {

	public static void main(String[] args) {
		String s="AAai";
		int vCount=0;
		int cCount=0;
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
				vCount++;
			else
				cCount++;

		}

		System.out.println("print vowel " +vCount);
		System.out.println("print consonent "+cCount);

	}
}
