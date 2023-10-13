package Java_practice_ty;

public class Reverse_each_charofword {

	public static void main(String[] args) {
		String s="java mainual and selenium";
		String[] st = s.split(" ");
		for(int i=0;i<st.length;i++)
		{
			String s1 = st[i];

			for(int j=s1.length()-1;j>=0;j--) 
			{
				System.out.print(s1.charAt(j));
			}
			System.out.print(" ");
		}
		
		

	}
}
