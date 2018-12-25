package clf.wrapper.demo;

import java.util.Arrays;

public class WrapperTest {

    private static final String SPACE_SEPARATOR = " ";
    public static void main(String[] args) {
	//TODO Auto-generated method stub
	String str = "15 54 88 44 -9 56 999";
	System.out.println(str);

	str = sortStringMethod(str);
	System.out.println(str);
    }

    public static String sortStringMethod(String str) {
	//TODO Auto-generated method stub
	
	String[] strs = str.split(SPACE_SEPARATOR);
	int[] intStrs = new int[strs.length];
	for(int x = 0; x < strs.length; x++){
	    intStrs[x] = Integer.parseInt(strs[x]);
	}
	Arrays.sort(intStrs);
	StringBuilder sb = new StringBuilder();
	for(int x = 0; x < intStrs.length; x++){
	    sb.append(intStrs[x]+SPACE_SEPARATOR);
	}
	return sb.toString();
    }
    

}
