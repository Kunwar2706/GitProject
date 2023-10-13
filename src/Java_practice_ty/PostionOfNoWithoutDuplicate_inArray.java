package Java_practice_ty;

import java.util.LinkedHashSet;

public class PostionOfNoWithoutDuplicate_inArray {

	public static void main(String[] args) {
int[] a= {2,3,4,5,6,2};
LinkedHashSet<Integer>set=new LinkedHashSet<Integer>();
for(int i=0;i<a.length;i++)
{
	set.add(a[i]);
}
for(Integer ob:set)
{
	for(int i=0;i<a.length;i++)
	{
		if(ob==a[i]) {
		System.out.println(ob+"is in "+(i+1)+" postion");
		break;
	}
	
}
	}

}
} 
