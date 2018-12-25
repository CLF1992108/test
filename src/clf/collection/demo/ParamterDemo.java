package clf.collection.demo;

public class ParamterDemo {

    public static void main(String[] args) {
	//TODO Auto-generated method stub

	//int sum = add(2, 3);
	//int sum = add(2, 3, 8);
	//System.out.println(sum);
//	int[] arr = {1, 4, 6, 8};
//	int sum = add(arr);
//	System.out.println(sum);
	int sum = newAdd(2, 3, 8, 2, 3, 8);
	System.out.println(sum);
    }

    public static int newAdd(int... arr) {
  	//TODO Auto-generated method stub
	int sum = 0;
	for (int k = 0; k < arr.length; k++) {
	    sum += arr[k];
	}
  	return sum;
    }

    public static int add(int i, int j) {
	//TODO Auto-generated method stub
	return i+j;
    }
    public static int add(int i, int j, int z) {
  	//TODO Auto-generated method stub
  	return i+j+z;
    }
    public static int add(int[] arr) {
  	//TODO Auto-generated method stub
	int sum = 0;
	for (int k = 0; k < arr.length; k++) {
	    sum += arr[k];
	}
  	return sum;
    }

}
