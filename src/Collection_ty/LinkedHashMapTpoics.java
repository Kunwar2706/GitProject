package Collection_ty;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class LinkedHashMapTpoics {

	public static void main(String[] args) {
		LinkedHashMap<Integer, Object> map = new LinkedHashMap<Integer, Object>();

		map.put(10, 30);
		map.put(80, 90);
		map.put(null, 50);// allowed
		map.put(50, null);//allowed
		map.put(50, "hi");
		map.put(50, "hello");//duplicta key are not allwed
		map.put(60, 30);//duplicate value is  allowed
		map.replace(10, "welcome");
		System.out.println("Size of map is  "+map.size());
		System.out.println("=======================================");
		System.out.println("key 50 is available in the set? :"+map.containsKey(50));
		System.out.println("=======================================");
		System.out.println("value welcome is availabe in the set? :"+map.containsValue("welcome"));
		System.out.println("Before Removing key 50 : "+map);
		map.remove(50);
		System.out.println("=======================================");
		System.out.println("After removing key 50 : "+map);
		System.out.println("=======================================");
		System.out.println("======================== Extracting key and value one by one ===========");
		for(Entry<Integer, Object> entry:map.entrySet())
		{
			System.out.println(entry.getKey()+" ----> "+entry.getValue());
		}

	}

}
