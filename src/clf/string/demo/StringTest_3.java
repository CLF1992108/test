package clf.string.demo;

public class StringTest_3 {

    public static void main(String[] args) {
	//TODO Auto-generated method stub
	String str = "  ad   s   ";
	String newStr = myTrim(str);
	System.out.println("-"+newStr+"-");
    }

    public static String myTrim(String str) {
	//TODO Auto-generated method stub
	int start = 0;
	int end = str.length()-1;
	while(start <=end && str.charAt(start) == ' '){
	    start++;
	    
	}
	while(start <=end && str.charAt(end) == ' '){
	    end--;
	    
	}
	str = str.substring(start,end+1);
	return str;
    }

}
