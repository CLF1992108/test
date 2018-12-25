package clf.io.demo;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipedStreamDemo {

    public static void main(String[] args) throws IOException {
	//TODO Auto-generated method stub
	PipedInputStream pis = new PipedInputStream();
	PipedOutputStream pos = new PipedOutputStream();
	pis.connect(pos);

	Thread t1 = new Thread(new Input(pis));
	Thread t2 = new Thread(new Output(pos));
	t1.start();
	t2.start();
	
    }

}

class Input implements Runnable{

    PipedInputStream pis = null;
    
    public Input(PipedInputStream pis){
	this.pis = pis;
	
    }
    @Override
    public void run() {
	//TODO Auto-generated method stub
	byte[] b = new byte[1024];
	try {
	    pis.read(b);
	    String s = new String(b);
	    System.out.println(s);
	    pis.close();
	} catch (IOException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
    }
    
    
}
class Output implements Runnable{

    PipedOutputStream pos = null;
    public Output(PipedOutputStream pos){
	this.pos = pos;
    }
    @Override
    public void run() {
	//TODO Auto-generated method stub
	try {
	    Thread.sleep(5000);
	    pos.write("你好！管道流".getBytes());
	    pos.close();
	} catch (IOException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	} catch (InterruptedException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
    }
    
}
