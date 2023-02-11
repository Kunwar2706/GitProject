package Array_TestYantra;

import java.util.LinkedHashSet;

public class occuranceEachNosInArray {

	public static void main(String[] args) {
		int[] a= {2,3,2,1,0,3};
		LinkedHashSet<Integer>set=new LinkedHashSet<Integer>();
		for(int i=0;i<a.length;i++) 
		{
			set.add(a[i]);
			// System.out.println(set);	
		}
		
		for(Integer inte:set) 
		{
			int count =0;
		for(int i=0;i<a.length;i++)
			{
				if(inte==a[i])
				{
					count++;
				}
			}
		
System.out.println(+inte+" is appear "+count+" times");
	}

}
}
