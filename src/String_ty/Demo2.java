package String_ty;

public class Demo2 {

	public static void main(String[] args) {
			String s="3a&1bc#*2";
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
		
		
			
			System.out.print(alpha+ " "+num+" "+spc);	

	}

	}
}
