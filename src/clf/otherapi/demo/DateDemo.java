package clf.otherapi.demo;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

    public static void main(String[] args) throws ParseException {
	//TODO Auto-generated method stub

	//method_1();
	//method_2();
	method_3();
	
    }

    public static void method_3() throws ParseException {
	//TODO Auto-generated method stub
	String s = "2017年02月03日";
	//DateFormat df = DateFormat.getDateInstance(DateFormat.LONG);
	DateFormat df = new SimpleDateFormat("yyyy年MM月dd日");
	Date d = df.parse(s);
	System.out.println(d);
    }

    public static void method_2() {
	//TODO Auto-generated method stub
	Date d = new Date();
	//DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
	//DateFormat df2 = DateFormat.getDateTimeInstance(DateFormat.SHORT,DateFormat.LONG);
	//String s = df.format(d);
	//String s2 = df2.format(d);
	//System.out.println(s);
	//System.out.println(s2);
	DateFormat df3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	String s3 = df3.format(d);
	System.out.println(s3);
	
	
	
    }

    public static void method_1() {
	long l1 = System.currentTimeMillis();
	System.out.println(l1);//1520842901975
	
	Date d2 = new Date(l1);
	System.out.println(d2);
	
//	d1.setTime(1520842901975l);
//	System.out.println(d1);
	Date d1 = new Date();
	System.out.println(d1);
	System.out.println(d1.getTime());
	
	System.out.println(d2.compareTo(d1));
    }

}
