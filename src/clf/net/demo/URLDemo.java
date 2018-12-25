package clf.net.demo;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class URLDemo {

    public static void main(String[] args) throws IOException {
	//TODO Auto-generated method stub

	URL url = new URL("http://192.168.7.180:8080/myweb/hello.html?name=lisi");
	
	String host = url.getHost();
	String protocol = url.getProtocol();
	int port = url.getPort();
	String par = url.getQuery();
	String path = url.getPath();
	String file = url.getFile();
//	System.out.println("host:"+host);
//	System.out.println("protocol:"+protocol);
//	System.out.println("port:"+port);
//	System.out.println("par:"+par);
//	System.out.println("path:"+path);
//	System.out.println("file:"+file);
	//InputStream is = url.openStream();
	URLConnection urlc = url.openConnection();
	String accept = urlc.getHeaderField("Accept-Ranges");
	System.out.println(accept);
	System.out.println(urlc);
	InputStream is = urlc.getInputStream();
	byte[] b = new byte[1024];
	int len = is.read(b);
	//System.out.println(new String(b, 0, len));
	is.close();
	
    }

}
