package clf.collection.demo;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapDemo {

    public static void main(String[] args) {
	//TODO Auto-generated method stub

	HashMap<Person,String> hashMap = new HashMap();
	
	hashMap.put(new Person("张三",11), "北京");
	hashMap.put(new Person("李四",12), "上海");
	hashMap.put(new Person("赵六",13), "天津");
	hashMap.put(new Person("王五",14), "福州");
	hashMap.put(new Person("王五",14), "厦门");
	
	Iterator<Person> i = hashMap.keySet().iterator();
	while(i.hasNext()){
	    Person p = i.next();
	    String value = hashMap.get(p);
	    
	    System.out.println("name:"+p.getName()+"...age:"+p.getAge()+"...city:"+value);
	}
    }
    

}
