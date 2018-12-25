package clf.collection.demo;

import java.util.Arrays;
import java.util.List;

public class ArraysDemo {

    public static void main(String[] args) {
	//TODO Auto-generated method stub

	int[] i = {2, 4, 6, 77, 776};
	///String s = ToString(i);
	///System.out.println(s);
	String[] s = {"asd", "asdwe", "fg"};
	String par = "asd1";
	System.out.println(myContain(s,par));
	List list = Arrays.asList(s);
	List list1 = Arrays.asList("asd", "asdwe", "fg");
	//list.add("asd");//虽然数组转成List集合但是其长度还是不可以改变
	System.out.println(list.contains("asd"));
	System.out.println(list);
	System.out.println(list1);
    }
    
    

    private static Boolean myContain(String[] s,String par) {
	//TODO Auto-generated method stub
	for (int i = 0; i < s.length; i++) {
	    if(s[i] == par)
		return true;
	    
	}
	return false;
    }



    public static  String ToString(int[] i) {
	//TODO Auto-generated method stub
	//String ii = Arrays.toString(i);
	if(i == null){
	    throw new NullPointerException("传入的为空数组请重新传入");
	}
	StringBuilder sb = new StringBuilder();
	int indexMax = i.length - 1;
	if(indexMax == -1)
	    return "[]";
	sb.append("[");
	for (int j = 0; ; j++) {
	    sb.append(i[j]);
	    if(j == indexMax)
		return sb.append("]").toString();
	    sb.append(",");
	}

	
    }
    

}
