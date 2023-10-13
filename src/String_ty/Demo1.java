package String_ty;

public class Demo1 {

	public static void main(String[] args) {
		String st="A1B2C3D";
		String ch=st.toLowerCase();
		char[] ch1=ch.toCharArray();
		

		String upper="";
		String num="";
		for(int i=ch1.length-1;i>=0;i--);
		if(ch1[i]>='a'&& ch1[i]<='z')
		{
	  upper=st.charAt(i);
	  System.out.println(upper);
		
		}



	}

}
