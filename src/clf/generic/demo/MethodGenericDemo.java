package clf.generic.demo;

import clf.collection.demo.Person;

public class MethodGenericDemo {

    public static void main(String[] args) {
	//TODO Auto-generated method stub

	Tool<String> t = new Tool<String>();
	//t.show("asdas");
	t.print(1);
	Tool.show("asdasd");
	Tool.show(new Person("asd",12));
    }

}
