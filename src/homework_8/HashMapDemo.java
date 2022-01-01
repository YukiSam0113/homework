package homework_8;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {
	public static void main(String[] args) {
		Map<String,Cats> cats=new HashMap<String,Cats>();
		cats.put("Tom", new Cats("Tom",2));
		cats.put("Jack", new Cats("Jack",3));
		cats.put("John", new Cats("John",4));
		
		Cats cat=cats.get("Tom");
		System.out.println(cat.getName());
		System.out.println(cats.containsKey("Jack"));
		System.out.println(cats.containsValue(cat));
	
		Iterator iter = cats.entrySet().iterator();
		while(iter.hasNext()) {
		   Map.Entry entry = (Map.Entry)iter.next();
		   System.out.println("next : "+ entry.getKey() +" - "+((Cat)entry.getValue()).getName());
		}

	}
}
