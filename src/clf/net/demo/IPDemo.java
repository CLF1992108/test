package clf.net.demo;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPDemo {

    public static void main(String[] args) throws UnknownHostException {
	//TODO Auto-generated method stub

	InetAddress ip = InetAddress.getLocalHost();
	ip = InetAddress.getByName("zhutou");
	System.out.println(ip.getHostAddress());
	System.out.println(ip.getHostName());
    }

}
