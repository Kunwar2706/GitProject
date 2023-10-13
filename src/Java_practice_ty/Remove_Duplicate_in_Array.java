package Java_practice_ty;

import java.util.LinkedHashSet;

public class Remove_Duplicate_in_Array {

	public static void main(String[] args) {
int []a= {3,4,5,3,4};
LinkedHashSet<Integer>set =new LinkedHashSet<Integer>();
for(int i=0;i<a.length;i++)
{
	set.add(a[i]);
}
for(Integer ch:set)
{
	System.out.println(ch);
}
	}

}
