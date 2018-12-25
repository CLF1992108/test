package clf.otherapi.demo;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

    public static void main(String[] args) throws ParseException {
	//TODO Auto-generated method stub

	String str_date = "2018-03-11";
	
	String str_otherDate = "2018-03-12";
	DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
	Date date = df.parse(str_date);
	System.out.println(date);
	Date otherDate = df.parse(str_otherDate);
	long l = date.getTime();
	long l2 = otherDate.getTime();
	long l3 = Math.abs(l2-l);
	System.out.println(l3/1000/60/60/24);
	
    }

}
