package clf.string.demo;

public class StringObjectDemo {

    public static void main(String[] args) {
	//TODO Auto-generated method stub
	String s1 = new String("adc");
	String s2 = s1.intern();
	System.out.println(s1.equals(s2));
    }

}
