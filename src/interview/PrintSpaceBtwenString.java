package interview;

public class PrintSpaceBtwenString {

	public static void main(String[] args) {
String s="stayhomestaysafe";
String[] st = s.split("3");

for(int i=0;i<st.length;i++)
{
	System.out.print(st[i]);
	System.out.print(" ");
}

	}

}
