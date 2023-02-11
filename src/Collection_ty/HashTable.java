package Collection_ty;

import java.util.Hashtable;
import java.util.Map.Entry;

public class HashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Hashtable<Integer, Object> map=new Hashtable<Integer,Object>();
map.put(10, 30);
map.put(80, 90);
//map.put(null, 50);//not allowed
//map.put(50, null);//not allowed
map.put(50, "hi");
map.put(50, "hello");//duplicta key are not allwed
map.put(60, 30);//duplicate value is not allowed
map.replace(10, "welcome");
System.out.println(map.size());
System.out.println(map.containsKey(50));
System.out.println(map.containsValue("welcome"));
map.remove(50);
System.out.println(map);

for(Entry<Integer, Object> m:map.entrySet())
{
	System.out.println(m.getKey()+""+m.getValue() );
}
	}

}
