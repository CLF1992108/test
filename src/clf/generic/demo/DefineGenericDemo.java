package clf.generic.demo;

import clf.collection.demo.Worker;

public class DefineGenericDemo {

    public static void main(String[] args) {
	//TODO Auto-generated method stub

	Tool<Worker> t = new Tool<Worker>();
	Worker s = new Worker("11",22);
	t.setM(s);
	t.getM();
    }

}
