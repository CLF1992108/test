package clf.net.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;
public class Send implements Runnable {

    private DatagramSocket ds;
    
    public Send(DatagramSocket ds){
	this.ds = ds;
    }
    @Override
    public void run() {
	//TODO Auto-generated method stub

	System.out.println("·¢ËÍ·½¿ªÆô");
	BufferedReader br = null;
	DatagramPacket dp = null;
	try {
	    br = new BufferedReader(new InputStreamReader(System.in));
	    String buf = null;
	    while((buf = br.readLine()) != null){
		
	    	dp = new DatagramPacket(buf.getBytes(), buf.getBytes().length,new InetSocketAddress("192.168.7.255", 9999));
	    	if(buf.length()>0)
	    	    ds.send(dp);
	    	if("886".equals(buf))
		    return;
	    }
	} catch (SocketException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	} catch (IOException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}finally{
	    if(br != null)
		try {
		    br.close();
		} catch (IOException e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		}
	    if(ds != null){
		
	    }
	}
    }

}
