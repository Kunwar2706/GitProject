package Java_practice_ty;

import java.util.LinkedHashSet;

public class CountDuplicateNoInArray {

	public static void main(String[] args) {
		int a[]= {3,4,5,3,5,5};
		LinkedHashSet<Integer> set =new LinkedHashSet<Integer>();
		for(int i=0;i<a.length;i++)
		{
			set.add(a[i]);
		}

		for(Integer ob:set)//3,4,5
		 {
			int count=0;
			for(int j=0;j<a.length;j++)
			{
				if(ob==a[j])
				{
					count++;
				}


				if(count>1)
				{

				}

			}
			System.out.println(ob+" is reapting "+count+" times");
		}
	}

}
