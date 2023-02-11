package Array_TestYantra;

import java.util.LinkedHashSet;

public class CountHowManyDuplictesAreRepeatings {

	public static void main(String[] args) {

		int[] a= {2,3,2,1,0,3};
		LinkedHashSet<Integer>set=new LinkedHashSet<Integer>();
		for(int i=0;i<a.length;i++)
		{
			set.add(a[i]);
		}
		for(Integer Inte:set)
		{
			int count=0;
			for(int i=0;i<a.length;i++)
			{
				if(Inte==a[i])
				{
					count++;
				}
			}
			if(count>1)
			{
				System.out.println(Inte +" is repeating "+count+" time");
			}
		}


	}

}
