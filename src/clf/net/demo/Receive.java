package clf.net.demo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Receive implements Runnable {

    private DatagramSocket ds;
    public Receive(DatagramSocket ds){
	this.ds = ds;
    }
    @Override
    public void run() {
	//TODO Auto-generated method stub

	System.out.println("接收方开启");
	DatagramPacket dp = null;
	String rece = "";
	while(true){
	    byte[] buf =new byte[1024]; 
	    dp = new DatagramPacket(buf, buf.length);
	    try {
		ds.receive(dp);
		rece = new String(dp.getData(),0,dp.getLength());
		System.out.println("ip"+dp.getAddress().getHostAddress()+":"+rece);
		if(rece.equals("886")){
		    System.out.println("ip"+dp.getAddress().getHostAddress()+"退出聊天"); 
		}
	    } catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	    }finally{
		
	    }
	}
    }

}
