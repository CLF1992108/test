package clf.string.demo;

public class StringTest_1 {

    public static void main(String[] args) {
	//TODO Auto-generated method stub
	String str = "fgfdgdacqweqwesdasdqwe";
	String key = "qwe";
	int count = getStringKeyCount_2(str, key);
	System.out.println("count=" + count);
    }

    private static int getStringKeyCount_2(String str, String key) {
	//TODO Auto-generated method stub
	int count = 0;
	int index = 0;
	while(str.indexOf(key,index) != -1){
	   index = str.indexOf(key,index) + key.length();
	   count++;
	}
	return count;
	
    }

    public static int getStringKeyCount(String str, String key) {
	//TODO Auto-generated method stub
	int count = 0;
	int index = 0;
	while(str.indexOf(key) != -1){
	    index = str.indexOf(key);
	    str = str.substring(index + key.length());
	    count++;
	}
	return count;
    }

}
