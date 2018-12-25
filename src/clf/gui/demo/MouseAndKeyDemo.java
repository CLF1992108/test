package clf.gui.demo;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MouseAndKeyDemo {
    private Frame f;
    private TextField tf;
    private Button b;
    
    public MouseAndKeyDemo() {
	init();
    }


    public void init() {
	//TODO Auto-generated method stub
	f = new Frame("my frame");
	tf = new TextField(15);
	b = new Button("my button");
	f.setLayout(new FlowLayout());
	f.setBounds(400,200,500,400);
	myEvent();
	f.add(tf);
	f.add(b);
	f.setVisible(true);
    }


    public void myEvent() {
	//TODO Auto-generated method stub
	f.addWindowListener(new WindowAdapter() {

	    @Override
	    public void windowClosing(WindowEvent e) {
		//TODO Auto-generated method stub
		System.exit(0);
	    }
	});
	tf.addKeyListener(new KeyAdapter() {

	    @Override
	    public void keyPressed(KeyEvent e) {
		//TODO Auto-generated method stub
//		System.out.println("key run" + e.getKeyChar() + ":" + KeyEvent.getKeyText(e.getKeyCode()));
//		
//		if(!(e.getKeyCode() > KeyEvent.VK_0 && e.getKeyCode() < KeyEvent.VK_9)){
//		    System.out.println("±ØÐëÊý×Ö");
//		    e.consume();
//		}
		if(e.isControlDown() && e.getKeyCode() == KeyEvent.VK_ENTER){
		    System.out.println("enter run");
		}
	    }
	});
	b.addActionListener(new ActionListener() {
	    
	    @Override
	    public void actionPerformed(ActionEvent e) {
		//TODO Auto-generated method stub
		System.out.println("Action button " );
	    }
	});
	b.addMouseListener(new MouseAdapter() {

	    @Override
	    public void mouseClicked(MouseEvent e) {
		//TODO Auto-generated method stub
		System.out.println("click button " + e.getClickCount());
		tf.setText("click button " + e.getClickCount());
	    }

//	    private int count = 1;
//	    @Override
//	    public void mouseEntered(MouseEvent e) {
//		//TODO Auto-generated method stub
//		System.out.println("enter button " + count++);
//	    }
	    
	});
    }


    public static void main(String[] args) {
	//TODO Auto-generated method stub

	new MouseAndKeyDemo();
    }

}
