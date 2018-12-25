package clf.string.demo;

public class StringBufferDemo {

    public static void main(String[] args) {
	//TODO Auto-generated method stub
	bufferMethodDemo_1();
    }

    private static void bufferMethodDemo_1() {
	//TODO Auto-generated method stub
	StringBuffer sb = new StringBuffer("abcd");
	//sb.delete(0, 4);
	sb.replace(1, 3, "asd");
	sb.setCharAt(1, 's');
	sb.setLength(0);
	System.out.println("sb="+sb);
	System.out.println("len="+sb.length());
    }

    public static void bufferMethodDemo() {
	//TODO Auto-generated method stub
	StringBuffer sb = new StringBuffer("yyyyyd");
	sb.append("ssss").append(true);
	sb.insert(1, "as");
	
	System.out.println(sb);
	
    }

}
