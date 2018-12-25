package clf.collection.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ToArrayDemo {

    public static void main(String[] args) {
	//TODO Auto-generated method stub

	List<String> list = new ArrayList<String>();
	list.add("list1");
	list.add("list3");
	list.add("list4");
	
	String[] strs = list.toArray(new String[list.size()]);
	System.out.println(Arrays.toString(strs));
    }

}
