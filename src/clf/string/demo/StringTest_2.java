package clf.string.demo;

public class StringTest_2 {

    public static void main(String[] args) {
	//TODO Auto-generated method stub
	String str = "qweryuabcdw";
	String otherStr = "sad";
	String maxSubstring = getMaxSubstring(str,otherStr);
	System.out.println(maxSubstring);
    }

    private static String getMaxSubstring(String str,String otherStr) {
	//TODO Auto-generated method stub
	String max = null;
	String min = null;
	String result = null;
	max = (str.length() > otherStr.length()) ? str : otherStr;
	min = (str.length() < otherStr.length()) ? str : otherStr;
	for (int i = 0; i < min.length(); i++) {
	    for (int j = 0, z = min.length()-i; z <= min.length(); j++,z++) {
		result = min.substring(j,z);
		if(max.contains(result))
		    return result;
	    }
	}
	return null;
    }
    

}
