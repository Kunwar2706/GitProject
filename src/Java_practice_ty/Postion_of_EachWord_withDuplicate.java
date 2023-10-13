package Java_practice_ty;

public class Postion_of_EachWord_withDuplicate {

	public static void main(String[] args) {
String s="i am from from bettiah bihar bihar";
String[] st = s.split(" ");
for(int i=0;i<st.length;i++)
{
	System.out.println(st[i]+" is in "+(i+1)+ " postion");
}
		

	}

}
