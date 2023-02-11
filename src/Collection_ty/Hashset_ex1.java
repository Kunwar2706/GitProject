package Collection_ty;

import java.util.ArrayList;
import java.util.HashSet;

public class Hashset_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Object> hs=new HashSet<Object>();
		hs.add(40);
		hs.add("hi");
		hs.add("hello");
		hs.add("hi");
		hs.add(null);
		hs.add(null);
		System.out.println(hs.size());
		System.out.println(hs.contains("hello"));
		System.out.println(hs.isEmpty());
		ArrayList<Object>list=new ArrayList<Object>(hs);
		list.add(7);
		list.add("bye");
		list.add(7);
		list.add(null);
		System.out.println(list);
		
		
		
		
		

	}

}
