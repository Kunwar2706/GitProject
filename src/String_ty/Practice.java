package String_ty;

public class Practice {

	public static void main(String[] args) {
		String str= "A21mi3t46";

		char [] arr=str.toCharArray();
		
	int sum=0;
		for(int i=0; i<arr.length;i++)
		{
			if(arr[i]>='0' && arr[i]<='9')
			{
				int num=arr[i]-48;
			sum=sum+num;
		}
		

	}
		System.out.println(sum);
	}

}
