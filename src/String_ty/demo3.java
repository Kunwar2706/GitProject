package String_ty;

public class demo3 {

	public static void main(String[] args) {
		String s="my name is xyz";
		String[] str = s.split(" ");
		System.out.print(str[0]+" ");
		for(int i=1;i<= str.length-1;i++)
		{

			String st=str[i];
			
			
			for(int j=st.length()-1;j>=0;j--)
			{
				System.out.print(st.charAt(j));
			}
			System.out.print(" ");
		}
		}
		

	}


