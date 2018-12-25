package clf.gui.demo;

import java.awt.Button;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameDemo {

    public static void main(String[] args) {
	//TODO Auto-generated method stub

	Frame f = new Frame("my frame");
	
//	f.setSize(500, 400);
//	f.setLocation(400, 150);
	f.setBounds(400, 150, 500, 400);
	f.setLayout(new FlowLayout());
	Button b = new Button("my button");
	f.add(b);
	f.addWindowListener(new WindowAdapter() {

	    @Override
	    public void windowClosing(WindowEvent e) {
		//TODO Auto-generated method stub
		//System.out.println("closing");
		System.exit(0);
	    }
	    
	});
	b.addActionListener(new ActionListener() {
	    
	    @Override
	    public void actionPerformed(ActionEvent e) {
		//TODO Auto-generated method stub
		System.out.println("button run....");
		System.exit(0);
	    }
	});
	f.setVisible(true);
	System.out.println("over");
    }

}
