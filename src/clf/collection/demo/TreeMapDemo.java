package clf.collection.demo;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

    public static void main(String[] args) {
	//TODO Auto-generated method stub

	ComparatorByName p = new ComparatorByName();
	TreeMap<Student,String> tm = new TreeMap<Student,String>(p);
	tm.put(new Student("a����",11), "����");
	tm.put(new Student("s����",12), "�Ϻ�");
	tm.put(new Student("d����",13), "���");
	tm.put(new Student("f����",88), "����");
	tm.put(new Student("g����",15), "����");
	
	Iterator<Map.Entry<Student, String>> i = tm.entrySet().iterator();
	while(i.hasNext()){
	    
	    Map.Entry<Student, String> me = i.next();
	    Student st = me.getKey();
	    String s = me.getValue();
	    System.out.println("name:"+st.getName()+"...age:"+st.getAge()+"...city:"+s);
	}
    }

}
