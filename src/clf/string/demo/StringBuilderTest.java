package clf.string.demo;

public class StringBuilderTest {

    public static void main(String[] args) {
	//TODO Auto-generated method stub
	String[] arr = {"2", "3", "9", "4", "8"};
	String s = arrayToSting_2(arr);
	System.out.println(s);
    }

    private static String arrayToSting_2(String[] arr) {
	//TODO Auto-generated method stub
	StringBuilder sb = new StringBuilder("[");
	for (int i = 0; i < arr.length; i++) {
	    if(i < arr.length-1)
		sb.append(arr[i] + ",") ;
	    else
		sb.append(arr[i] + "]") ;
		
	}
	return sb.toString();
    }

    private static String arrayToSting_1(String[] arr) {
	//TODO Auto-generated method stub
	String str = "[";
	for (int i = 0; i < arr.length; i++) {
	    if(i < arr.length-1)
		str += arr[i] + ",";
	    else
		str += arr[i] + "]";
	}
	return str;
    }

}
