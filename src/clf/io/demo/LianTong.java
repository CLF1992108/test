package clf.io.demo;

public class LianTong {

    public static void main(String[] args) {
	//TODO Auto-generated method stub

	String str = "��ͨ";
	byte[] bs = str.getBytes();
	
	for(byte b : bs){
	    System.out.println(Integer.toBinaryString(b & 255));
	}
		
		
    }

}
