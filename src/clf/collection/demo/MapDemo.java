package clf.collection.demo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {

    public static void main(String[] args) {
	//TODO Auto-generated method stub

	Map<Integer,String> map = new HashMap<Integer,String>();
	//mapMethod(map);
	//mapMethod_2(map);
	//mapMethod_3(map);
	mapMethod_4(map);
    }

    
    public static void mapMethod_4(Map<Integer, String> map) {
	//TODO Auto-generated method stub
	map.put(3, "asd3");
	map.put(5, "asd5");
	map.put(9, "asd9");
	map.put(6, "asd6");
	map.put(4, "asd3");
	
	Collection<String> coll = map.values();
	Iterator<String> i = coll.iterator();
	
	while(i.hasNext()){
	    
	    String value = i.next();
	    System.out.println("value:"+value);
	}
	
    }


    public static void mapMethod_3(Map<Integer, String> map) {
	//TODO Auto-generated method stub
	
	map.put(3, "asd3");
	map.put(5, "asd5");
	map.put(9, "asd9");
	map.put(6, "asd6");
	Set<Map.Entry<Integer, String>> set = map.entrySet();
	Iterator<Map.Entry<Integer, String>> i = set.iterator();
	while(i.hasNext()){
	    Map.Entry<Integer, String> me = i.next();
	    int key = me.getKey();
	    String value = me.getValue();
	    System.out.println("key:"+key+"...........value:"+value);
	    
	}
    }


    public static void mapMethod_2(Map<Integer,String> map) {
	//TODO Auto-generated method stub
	
	map.put(3, "asd3");
	map.put(5, "asd5");
	map.put(9, "asd9");
	map.put(6, "asd6");
	
	Set<Integer> set = map.keySet();
	Iterator<Integer> i = set.iterator();
	while(i.hasNext()){
	    int key = i.next();
	    String value = map.get(key);
	    System.out.println("key:"+key+"...value:"+value);
	}
    }


    public static void mapMethod(Map<Integer,String> map) {
	//TODO Auto-generated method stub
	System.out.println(map.put(2, "asd2"));
	System.out.println(map.put(2, "asd22"));
	map.put(3, "asd3");
	map.put(5, "asd5");
	map.put(9, "asd9");
	map.put(6, "asd6");
	
	System.out.println("remove:" + map.remove(2));
	
	System.out.println("constainsKey:" + map.containsKey(2));
	System.out.println("constainsValue:" + map.containsValue("asd5"));
	
	System.out.println("get:" + map.get(5));
	System.out.println(map);
	
	
    }

}
