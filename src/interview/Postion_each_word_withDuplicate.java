package interview;

public class Postion_each_word_withDuplicate {

	public static void main(String[] args) {
   String s="welcome to india";
  String st[]=s.split(" ");
  for(int i=0;i<st.length;i++)
  {
	  System.out.println(st[i]+" is in "+(i+1)+ " postion");
  }
	}

}
