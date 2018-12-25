package clf.string.demo;

public class StringConstructorDemo {

	public static void main(String[] args) {
	    stringConstructor();
	    stringConstructor2();
	}

	private static void stringConstructor2() {
	    //TODO Auto-generated method stub
	    char[] c = {'q', 'a', 's', 'r', 'y'};
	    String s = new String(c, 2, 3);
	    System.out.println(s);
	}

	private static void stringConstructor() {
	    //TODO Auto-generated method stub
	    byte[] b = {65,66,67,68};
	    String s = new String(b);
	    System.out.println(s);
	}


	
}
