package clf.string.demo;

public class StringMethodDemo {

    public static void main(String[] args) {
	//TODO Auto-generated method stub
	stringMethodDemo_4();
    }

    private static void stringMethodDemo_4() {
	//TODO Auto-generated method stub
	System.out.println("ax".compareTo("xa"));
    }

    private static void stringMethodDemo_3() {
	//TODO Auto-generated method stub
	String s = "abc";
	System.out.println(s.equalsIgnoreCase("ABC"));
	System.out.println(s.contains("abcd"));
	System.out.println(s.startsWith("ab"));
	System.out.println(s.endsWith("bcs"));
    }

    private static void stringMethodDemo_2() {
	//TODO Auto-generated method stub
	String s = "张三,李四,王五"; 
	String[] str = s.split(",");
	for(int x = 0; x < str.length; x++){
	    System.out.println("split:" + str[x]);
	}
	char[] chs = s.toCharArray();
	
	for(int x = 0; x < chs.length; x++){
	    System.out.println("toCharArray:" + chs[x]);
	}
	String s1 = "Wsd";
	System.out.println("toUpperCase:" + s1.toUpperCase());
	System.out.println("toLowerCase:" + s1.toLowerCase());
	byte[] s2 = s1.getBytes();
	for(int x = 0; x < s2.length; x++){
	    System.out.println("getBytes:" + s2[x]);
	}
	System.out.println("replace:" + s1.replace('f', 'S'));
	System.out.println("replace:" + "ss".concat(s1));
	
	System.out.println("   -aaa-cc  d-    ".trim() );
	
	String s3 = String.valueOf(1)+2;
	System.out.println(s3);
    }
    

    private static void stringMethodDemo_1() {
	//TODO Auto-generated method stub
	String s = "asdfghas";
	System.out.println("s:length="+s.length());
	System.out.println("s:char="+s.charAt(2));
	System.out.println("s:indexOfchar="+s.indexOf('a'));
	System.out.println("s:indexOfString="+s.indexOf("as"));
	System.out.println("s:lastIndexOfchar="+s.lastIndexOf('a'));
	System.out.println("s:lastIndexOfString="+s.lastIndexOf("as"));
	System.out.println("s:substring="+s.substring(2,4));
    }
    

}
