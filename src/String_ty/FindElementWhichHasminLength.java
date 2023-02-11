package String_ty;

public class FindElementWhichHasminLength {

	public static void main(String[] args) {
		//String[] s= {"asd","db","qddqwdq","ab","abcdefg"};
		// 
		//int small=s[0].length();
		//for(int i=0;i<s.length;i++)
		//{
		//	int l1 = s[i].length();
		//	for(int j=1;j<s.length;j++)
		//	{
		//		int l2 = s[j].length();
		//		if(l1<l2)
		//		{
		//			small=l1;
		//		}
		//	}
		//	
		//}
		//for(int i=0;i<s.length;i++)
		//{
		//	if(s[i].length()==small)
		//		System.out.println("small is "+s[i]);
		//	
		//
		//}
		//String[] s= {"131214","23","12434234","12","12123412"};
		String[] s= {"asd","db","qddqwdq","ab","abcdefg"};
		String min_length=s[0];
		for(int i=0;i<s.length;i++)
		{
			if(min_length.length()>s[i].length())//formax  length change sign <
			{
				min_length=s[i];
			}

		}

		for(int i=0;i<s.length;i++)
		{
			if(min_length.length()==s[i].length())
			{
				System.out.println(s[i]);
			}
		}
	}



}
