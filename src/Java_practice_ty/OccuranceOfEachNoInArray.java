package Java_practice_ty;

import java.util.LinkedHashSet;
import java.util.LinkedList;

public class OccuranceOfEachNoInArray {

	public static void main(String[] args) {
int[]a= {3,4,5,3,4,5};
LinkedHashSet<Integer>set=new LinkedHashSet<Integer>();
for(int i=0;i<a.length;i++)
{
	set.add(a[i]);
}
for(Integer ch:set)//3,4,5
{
	int count=0;
	for(int j=0;j<a.length;j++)
	{
		if(ch==a[j])
		{
			count++;
		}
	}
	System.out.println(ch+" occurs in "+count+" times");
}
	}

}
