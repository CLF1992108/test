package clf.string.demo;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stringDemo1();
	}
	public static void stringDemo1(){
		
		String s = "abc";
		String s1 = new String("abc");
		String s2 = new String("abc");
		System.out.println(s);
		System.out.println(s1.equals(s1==s2));
	}

}
