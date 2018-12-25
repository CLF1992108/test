package clf.reflect.demo;

public class MainBoard {

    public void newPLC(PLC plc){
	
	plc.open();
	plc.close();
    }
    public void run(){
	
	System.out.println("MainBoard run");
	
    }
    
}
