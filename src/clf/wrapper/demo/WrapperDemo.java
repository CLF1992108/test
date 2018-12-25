package clf.wrapper.demo;

public class WrapperDemo {


    public static void main(String[] args) {
	//TODO Auto-generated method stub
	System.out.println(Integer.MAX_VALUE);
	System.out.println(Integer.toBinaryString(-6));
	System.out.println("123"+1);
	
	try{
	    
	    System.out.println(Integer.parseInt("12w3")+1);
	    
	}catch(NumberFormatException e){
	    
	    System.out.println("输入内容包含非数值请重新输入");
	}
	int a = Integer.valueOf("22");
	System.out.println(a);
	
	System.out.println(Integer.toBinaryString(60));
	System.out.println(Integer.toOctalString(60));
	System.out.println(Integer.toHexString(60));
	
	System.out.println(Integer.toString(60,3));
	
	Integer i = new Integer("22");
	System.out.println(i.intValue()+2);
	System.out.println(Integer.parseInt("110",3));
	
	Integer i1 = new Integer(-2);
	Integer i2 = new Integer("-1");
	
	System.out.println(i1 == i2);
	System.out.println(i1.equals(i2));
	System.out.println(i1.compareTo(i2));
	
    }	
    
    

}
