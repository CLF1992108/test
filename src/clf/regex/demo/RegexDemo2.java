package clf.regex.demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo2 {

    public static void main(String[] args) {
	//TODO Auto-generated method stub

	function_4();
    }

    public static void function_4() {
	//TODO Auto-generated method stub
	String str = "da jia hao,hen gao xing jian dao ni men";
	String regex = "\\b[a-z]{3}\\b";
	Pattern p = Pattern.compile(regex);
	Matcher m = p.matcher(str);
	while(m.find()){
	    String s = m.group();
	    System.out.println(s+":"+m.start()+":"+m.end());
	}
	
	
    }

    public static void function_3() {
	//TODO Auto-generated method stub
	String str = "zhangsan&&&&lisi)))))wangwu";
	String regex = "(.)\\1+";
	str = str.replaceAll(regex, "$1");
	System.out.println(str);
	String str1 = "15394415663";
	String regex1 = "(\\d{3})\\d{4}(\\d{4})";
	str1 = str1.replaceAll(regex1, "$1****$2");
	System.out.println(str1);
	
    }

    public static void function_2() {
	//TODO Auto-generated method stub
	String str = "zhangsan&&&&lisi)))))wangwu";
	String regex = "(.)\\1+";
	String[] strs = str.split(regex);
	for(String s : strs){
	    System.out.println(s);
	}
    }

    public static void function_1() {
	//TODO Auto-generated method stub
	
	String str = "133456789011";
	String regex = "1[358]\\d{9}";
	boolean b = str.matches(regex);
	System.out.println("str:"+b);
    }

}
