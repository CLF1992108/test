package clf.generic.demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

    public static void main(String[] args) {
	//TODO Auto-generated method stub

	HashMap<Integer, String> hs = new LinkedHashMap<Integer, String>();
	hs.put(1, "dfs");
	hs.put(8, "asd");
	hs.put(3, "ffc");
	hs.put(2, "sdffc");
	
	Iterator<Map.Entry<Integer, String>> i = hs.entrySet().iterator();
	while(i.hasNext()){
	    Map.Entry<Integer, String> me = i.next();
	    System.out.println(me.getKey()+":"+me.getValue());
	}
    }

}
