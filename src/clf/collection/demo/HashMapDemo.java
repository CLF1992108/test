package clf.collection.demo;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapDemo {

    public static void main(String[] args) {
	//TODO Auto-generated method stub

	HashMap<Person,String> hashMap = new HashMap();
	
	hashMap.put(new Person("����",11), "����");
	hashMap.put(new Person("����",12), "�Ϻ�");
	hashMap.put(new Person("����",13), "���");
	hashMap.put(new Person("����",14), "����");
	hashMap.put(new Person("����",14), "����");
	
	Iterator<Person> i = hashMap.keySet().iterator();
	while(i.hasNext()){
	    Person p = i.next();
	    String value = hashMap.get(p);
	    
	    System.out.println("name:"+p.getName()+"...age:"+p.getAge()+"...city:"+value);
	}
    }
    

}
