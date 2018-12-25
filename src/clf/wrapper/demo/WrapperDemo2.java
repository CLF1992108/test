package clf.wrapper.demo;

public class WrapperDemo2 {

    public static void main(String[] args) {
	//TODO Auto-generated method stub
	Integer i =  4;
	i = i + 6;
	show(i);
	Integer a = new Integer("12");
	Integer b = new Integer("12");
	
	Integer c = 128;
	Integer d = 128;
	
	System.out.println(a==b);
	System.out.println(a.equals(b));
	System.out.println(c==d);
	System.out.println(c.equals(d));
    }

    public static void show(Object o) {
	//TODO Auto-generated method stub
	System.out.println("o="+o);
    }

}
