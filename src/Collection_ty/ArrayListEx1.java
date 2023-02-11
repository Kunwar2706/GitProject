package Collection_ty;

import java.util.ArrayList;  
import java.util.Collections;
import java.util.Stack;

public class ArrayListEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Object> al=new ArrayList<Object>();
al.add(10);
al.add(null);
al.add("hi");
al.add(10);
al.add("null");
al.add(40);
al.add(60);
System.out.println(al);
ArrayList<Integer>list =new ArrayList<Integer>();
list.add(40);
list.add(4);
list.add(30);
list.add(10);
list.add(60);
Collections.sort(list);//sorting in ascending ordrerr
System.out.println(list);
al.addAll(list);//add list to al
System.out.println(al);
//check the object is present or not
if(al.contains("hi"))
{
	System.out.println("is present");
}
else {
	System.out.println("not present");
}
//fetch element 1 by one
for(Object ob:al)
{
	System.out.println(ob);
}
al.add(3,"hello");// add object to the index 3
al.remove(4);//removing object present in index 4
System.out.println(al.get(5));//get the object present in the index 5
System.out.println(al.remove("30"));//REMOVE THE OBJECT 30
System.out.println(al.set(6,"bye"));// add the object by to the index 6
System.err.println(al.size());//fetch the size
System.out.println(al);
Stack<Object> s=new Stack<Object>();
s.push(10);
s.push(20);
System.out.println(s.pop());
System.out.println(s.pop());
	}

}


