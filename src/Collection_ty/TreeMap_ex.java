package Collection_ty;

import java.util.TreeMap;

public class TreeMap_ex {

	public static void main(String[] args) {
		TreeMap<Character, Object>map=new TreeMap<Character,Object>();
		map.put('d', 50);
		map.put('g', "hi");
		map.put('z', 90);
		map.put('b', "hello");
		map.put('m', 1000);
		map.put('d', 60);
		map.put('c', "hi");
		//map.put(null, 50);
		map.put('t', null);
		map.put('x', null);
		System.out.println(map);
	
		
		
		

	}

}
