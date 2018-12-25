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
	map.put("����һ", "Mon");
	map.put("���ڶ�", "Tue");
	map.put("������", "Wed");
	map.put("������", "Thu");
	map.put("������", "Fri");
	map.put("������", "Sat");
	map.put("������", "Sun");
	
	return map.get(week);
    }

    public static String getWeek(int week) {
	//TODO Auto-generated method stub
	String[] weeks = {"","����һ","���ڶ�","������","������","������","������","������"};
	
	if(week < 1 || week > 7)
	    throw new RuntimeException("�����������Ч����");
	return weeks[week];
    }

}
