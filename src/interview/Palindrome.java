package interview;

public class Palindrome {
	
	public static void main(String[] args) {
		
		String s="mom dad child";
		String s1[]=s.split(" ");
		String reverse="";
		for(int i=0;i<s1.length;i++)
		{
			String str=s1[i];
			/*for(int j=str.length()-1;j>=0;j--)
			{
				reverse=reverse+str.charAt(j);
				
			}*/
			boolean flag=true;
			int k=0;int j=str.length()-1;
			while(j>k) {
				char ch=str.charAt(i);
				char ch2=str.charAt(j);
				
			if(ch!=ch2) {
				flag=false;
			}
			j--;
			k++;
		}
			if(flag)
			{
				System.out.println(str);
			}
	}

}
}
