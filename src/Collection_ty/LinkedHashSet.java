package Collection_ty;

public class LinkedHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
java.util.LinkedHashSet<Object> set=new java.util.LinkedHashSet<Object>();
set.add(40);
set.add("hi");
set.add("hello");
set.add("hi");
set.add(null);
set.add(null);
System.out.println(set.size());
System.out.println(set.contains("hi"));
System.out.println(set.remove(null));
System.out.println(set);


	}

}
