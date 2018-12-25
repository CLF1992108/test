package clf.collection.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class CollectionsDemo {

    public static void main(String[] args) {
	//TODO Auto-generated method stub
	
	List<String> al = new ArrayList<String>();
	al.add("asd");
	al.add("cdfd");
	al.add("zsd");
	al.add("azzasd");
	al.add("tsd");
	
	//System.out.println(al);
	//mySort(al);
	Collections.sort(al);
	//mySort(al,new ComparatorByLen());
	//int index = Collections.binarySearch(al, "asd1");
	//String max = Collections.max(al,new ComparatorByLen());
	//System.out.println(max);
	//System.out.println(Collections.replaceAll(al, "tsd", "uyi"));
	al.set(al.indexOf("tsd"), "uyi");
	Collections.reverse(al);
	//Collections.fill(al, "asdasd");
	Collections.shuffle(al);
	Collections.synchronizedList(al);
	System.out.println(al);
	
//	TreeSet<String> ts = new TreeSet<String>(new Comparator<String>() {
//
//	    @Override
//	    public int compare(String o1, String o2) {
//		//TODO Auto-generated method stub
//		int temp = o2.compareTo(o1);
//		return temp;
//	    }
//	    
//	});
	TreeSet<String> ts = new TreeSet<String>(Collections.reverseOrder(new ComparatorByLen()	));
	ts.add("asd");
	ts.add("cdfd");
	ts.add("zsd");
	ts.add("azzasd");
	ts.add("tsd");
	Collections.synchronizedSet(ts);
	System.out.println(ts);
	
    }
    
    
    public static <T> void mySort(List<T> al,Comparator<? super T> c) {
	//TODO Auto-generated method stub
	for (int i = 0; i < al.size()-1; i++) {
	    for (int j = i+1; j < al.size(); j++) {
		if(c.compare(al.get(i), al.get(j))>0){
		    
//		    T temp = al.get(i);
//		    al.set(i, al.get(j));
//		    al.set(j, temp);
		    Collections.swap(al, i, j);
		    
		}
	    }
	}
	
    }
    public static <T extends Comparable<? super T>> void mySort(List<T> al) {
	//TODO Auto-generated method stub
	for (int i = 0; i < al.size()-1; i++) {
	    for (int j = i+1; j < al.size(); j++) {
		if(al.get(i).compareTo(al.get(j))>0){
		    
//		    T temp = al.get(i);
//		    al.set(i, al.get(j));
//		    al.set(j, temp);
		    Collections.swap(al, i, j);
		    
		}
	    }
	}
	
    }

}
