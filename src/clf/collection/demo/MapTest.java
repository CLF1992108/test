package clf.collection.demo;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class MapTest {

    public static void main(String[] args) {
	//TODO Auto-generated method stub

	String str = "AAAFFFFas    da[[sdf'sdd'''fgdf";
	str = getCharCount(str);
	System.out.println(str);
    }

    private static String getCharCount(String str) {
	//TODO Auto-generated method stub
	Map<Character,Integer> m = new TreeMap<Character,Integer>();
	char[] chs = str.toCharArray();
	int count = 1;
	//int value = 1;
	for (int i = 0; i < chs.length; i++) {
	    char ch = chs[i];
	    if(!((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')))
	    	continue;
	    if(m.get(ch) != null){
		
		count = m.get(ch)+1;
	    }
	    m.put(ch, count);
	    count = 1;
	    
	}
	
	StringBuilder sb = new StringBuilder();
	Iterator<Map.Entry<Character, Integer>> i = m.entrySet().iterator();
	while(i.hasNext()){
	    Map.Entry<Character, Integer> me = i.next();
	    char key = me.getKey();
	    Integer value = me.getValue();
	    sb.append(key+"("+value+")");
	}
	return sb.toString();
    }
    

}
