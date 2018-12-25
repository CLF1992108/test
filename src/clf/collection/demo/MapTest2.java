package clf.collection.demo;

import java.util.HashMap;
import java.util.Map;

public class MapTest2 {

    public static void main(String[] args) {
	//TODO Auto-generated method stub

	String week = getWeek(2);
	System.out.println(week);
	System.out.println(getWeekByMap(week));
    }

    public static String getWeekByMap(String week) {
	//TODO Auto-generated method stub
	Map<String,String> map = new HashMap<String,String>();
	map.put("星期一", "Mon");
	map.put("星期二", "Tue");
	map.put("星期三", "Wed");
	map.put("星期四", "Thu");
	map.put("星期五", "Fri");
	map.put("星期六", "Sat");
	map.put("星期日", "Sun");
	
	return map.get(week);
    }

    public static String getWeek(int week) {
	//TODO Auto-generated method stub
	String[] weeks = {"","星期一","星期二","星期三","星期四","星期五","星期六","星期日"};
	
	if(week < 1 || week > 7)
	    throw new RuntimeException("您输入的是无效星期");
	return weeks[week];
    }

}
