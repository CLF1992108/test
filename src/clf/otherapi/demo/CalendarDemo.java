package clf.otherapi.demo;

import java.util.Calendar;

public class CalendarDemo {

    public static void main(String[] args) {
	//TODO Auto-generated method stub
	
	showDate(2012);
    }

    private static void showDate(int year) {
	Calendar c = Calendar.getInstance();
	c.set(year, 2, 1);
	c.add(Calendar.DAY_OF_MONTH, -1);
	showDate(c);
	
    }

    private static void showDate(Calendar c) {
	int year = c.get(Calendar.YEAR);
	int month = c.get(Calendar.MONTH)+1;
	int day = c.get(Calendar.DAY_OF_MONTH);
	int week = c.get(Calendar.DAY_OF_WEEK);
	
	System.out.println(year+"-"+month+"-"+day+"  "+getWeek(week));
    }

    private static String getWeek(int week) {
	//TODO Auto-generated method stub
	String[] weeks = {"", "星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"};
	return weeks[week];
    }

}
