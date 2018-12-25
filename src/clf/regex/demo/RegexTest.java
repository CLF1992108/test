package clf.regex.demo;

import java.util.TreeSet;

public class RegexTest {

    public static void main(String[] args) {
	//TODO Auto-generated method stub

	test_3();
    }

    public static void test_3() {
	//TODO Auto-generated method stub
	String str = "791260656@qq.com.cn";
	String regex = "[a-zA-Z0-9]+@[a-zA-Z0-9]+(\\.[a-zA-Z]{1,3})+";
	regex = "\\w+@\\w+(\\.\\w+)+";
	boolean b = str.matches(regex);
	
	System.out.println(b);
    }

    public static void test_2() {
	//TODO Auto-generated method stub
	String str = "192.168.0.1 127.0.0.1 3.3.3.3 158.66.10.1";
	str = str.replaceAll("(\\d+)", "00$1");
	
	str = str.replaceAll("0*(\\d{3})", "$1");
	
	String[] str1 = str.split(" +");
	TreeSet<String> ts = new TreeSet<String>();
	for(String s : str1){
	    ts.add(s);
	}
	for(String s1 : ts){
	    System.out.println(s1.replaceAll("0*(\\d+)", "$1"));
	}
	
    }

    public static void test_1() {
	//TODO Auto-generated method stub
	String str = "我我....我我我....我我要要....要要要...要...要学学学..学编编编编....编程程程程....程程程";
	str = str.replaceAll("\\.", "");
	str = str.replaceAll("(.)\\1+", "$1");
	System.out.println(str);
    }

}
