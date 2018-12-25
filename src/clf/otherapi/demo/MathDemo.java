package clf.otherapi.demo;

import java.util.Random;

public class MathDemo {

    public static void main(String[] args) {
	//TODO Auto-generated method stub

//	double b1 = Math.ceil(12.4);
//	double b2 = Math.floor(-12.6);
//	double b3 = Math.round(12.5);
//	System.out.println(b1);
//	System.out.println(b2);
//	System.out.println(b3);
	
	RandomMethod();
	
	//System.out.println(Math.pow(2,10));
    }

    private static void RandomMethod() {
	//TODO Auto-generated method stub
	Random r = new Random();
	for (int i = 0; i < 10; i++) {
	    double b = Math.ceil((Math.random()*10));
	    // double b = (int)(r.nextDouble()*10)+1;
	    int c = r.nextInt(10)+1;
	    System.out.println(b);
	}
	
    }

}
