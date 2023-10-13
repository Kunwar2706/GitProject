package interview;

public class Revese_each_word_String {

	public static void main(String[] args) {
  String s="today start with java";
  String[] word = s.split(" ");
for (int i= word.length-1;i>=0;i--)
{
	System.out.print(word[i]+" ");
}
	}

}
