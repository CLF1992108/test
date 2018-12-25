package clf.regex.demo;

public class RegexDemo {

    public static void main(String[] args) {
	//TODO Auto-generated method stub

//	String qq = "0123456111111111111111111";
//	String regex = "[1-9][0-9]{4,14}";
//	boolean result = qq.matches(regex);
//	System.out.println(qq+":"+result);
	String str = "aooooooob";
	String regex = "ao{4,6}b";
	boolean b = str.matches(regex);
	System.out.println("str:"+b);
    }

}
