package clf.collection.demo;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

    public static void main(String[] args) {
	//TODO Auto-generated method stub

	ComparatorByName p = new ComparatorByName();
	TreeMap<Student,String> tm = new TreeMap<Student,String>(p);
	tm.put(new Student("a张三",11), "北京");
	tm.put(new Student("s李四",12), "上海");
	tm.put(new Student("d赵六",13), "天津");
	tm.put(new Student("f王五",88), "福州");
	tm.put(new Student("g王五",15), "厦门");
	
	Iterator<Map.Entry<Student, String>> i = tm.entrySet().iterator();
	while(i.hasNext()){
	    
	    Map.Entry<Student, String> me = i.next();
	    Student st = me.getKey();
	    String s = me.getValue();
	    System.out.println("name:"+st.getName()+"...age:"+st.getAge()+"...city:"+s);
	}
    }

}
