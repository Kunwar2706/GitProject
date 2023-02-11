package Collection_ty;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkList_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<Object> list=new LinkedList<Object>();
list.add(10);
list.add("hi");
list.add("hi");
list.add(null);
list.add(null);
list.add(30);
list.add(40);
//check the object is present or not
if(list.contains("hi"))
{
	System.out.println("is present");
}
else {
	System.out.println("not present");
}
//fetch element 1 by one
for(Object ob:list)
{
	System.out.println(ob);
}
list.remove("hi");
System.out.println(list);
System.out.println(list.indexOf(40));
System.out.println(list.size());
list.addFirst(5);
list.addLast(90);
System.out.println(list.getFirst());
System.out.println(list.getLast());
list.getLast();
list.removeFirst();
list.removeLast();
System.out.println(list);


Iterator<Object> it = list.iterator();//fetching object one by one
while(it.hasNext()) {
	System.out.println(it.next());
}
	}

}
