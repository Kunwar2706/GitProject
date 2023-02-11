package Java_practice_ty;

public class Reverse_word_in_string {

	public static void main(String[] args) {
		String s="welcome To India";
		String[] st = s.split("");
		for(int i=st.length-1;i>=0;i--)
		{
			System.out.print(st[i]+" ");
		}
		

	}

}
