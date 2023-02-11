package Java_practice_ty;

public class Postion_of_each_Char_with_Duplicate {

	public static void main(String[] args) {
		String s="TestYantra";
		char[] ch = s.toCharArray();
		//ArrayList<Character> set=new ArrayList<Character>();
		for(int i=0;i<ch.length;i++)
		{
		//	set.add(ch[i]);

		
		
			System.out.println(ch[i]+" is in "+(i+1)+" postion");
		}
		
	}
}
