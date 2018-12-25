package clf.string.demo;
public class StringTest {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	String[] strArr = { "asd", "sda", "bssd", "dw", "gds" };
	printArray(strArr);
	sortString(strArr);
	printArray(strArr);
    }

    public static void sortString(String[] strArr) {
	// TODO Auto-generated method stub
	for (int i = 0; i < strArr.length - 1; i++) {
	    for (int j = i + 1; j < strArr.length; j++) {
		if (strArr[i].compareTo(strArr[j]) > 0)
		    swap(strArr, i, j);
	    }
	}

    }
    
    private static void swap(String[] strArr, int i, int j) {
	// TODO Auto-generated method stub
	String temp = strArr[i];
	strArr[i] = strArr[j];
	strArr[j] = temp;
    }

    public static void printArray(String[] strArr) {
	// TODO Auto-generated method stub
	System.out.print("[");
	for (int i = 0; i < strArr.length; i++) {
	    if (i < strArr.length - 1)
		System.out.print(strArr[i] + ",");
	    else
		System.out.println(strArr[i] + "]");
	}
    }

}
