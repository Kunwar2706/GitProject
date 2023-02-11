package String_ty;

public class Segregate_alphabets_No_and_special_char {

	public static void main(String[] args) {
			String s="a3f2$v!5^";//o/p =afv 325 $!^
			String alpha="";
			String num=" ";
			String spc=" ";
			for(int i=0;i<s.length();i++)
			{
				if(s.charAt(i)>='A' && s.charAt(i)<='Z' || s.charAt(i)>='a' && s.charAt(i)<='z')
				{
					alpha=alpha+s.charAt(i);
					
				}
				else if(s.charAt(i)>='0' && s.charAt(i)<='9')
						{
					num=num+s.charAt(i);
						}
				else
				{
					spc=spc+s.charAt(i);
				}
			}
			
			
			System.out.println(alpha+ " "+num+" "+spc);	

	}

}
