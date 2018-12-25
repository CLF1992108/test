package clf.collection.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ForEachDemo {

    public static void main(String[] args) {
	//TODO Auto-generated method stub

	//method1();
	
	Map<String,Integer> map = new HashMap<String,Integer>();
	map.put("zhangsan1", 12);
	map.put("zhangsan2", 14);
	map.put("zhangsan3", 15);
	map.put("zhangsan4", 17);
	
	Set<String> strSet = map.keySet();
	for(String key : strSet){
	    Integer value = map.get(key);
	    System.out.println(key + ":" + value);
	}
	Set<Map.Entry<String, Integer>> set = map.entrySet();
	for(Map.Entry<String, Integer> me : set){
	    String key = me.getKey();
	    Integer value = me.getValue();
	    System.out.println(key + "::" + value );
	}
    }

    private static void method1() {
	List<String> list = new ArrayList<String>();
	list.add("asda1");
	list.add("asda2");
	list.add("asda3");
	list.add("asda4");
	
	Iterator<String> i = list.iterator();
	while(i.hasNext()){
	    String s = i.next();
	   
	    System.out.println(s);
	    //i.remove();
	    
	}
	for(String s : list){
	  
	    System.out.println(s);
	}
	
	int[] arr = {2, 3, 8, 6, 9};
 	
	for(int z : arr){
	    
	    System.out.println(z);
	}
    }

}
