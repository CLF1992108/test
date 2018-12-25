package clf.reflect.demo;

public class ReflectDemo {

    public static void main(String[] args) throws ClassNotFoundException {
	//TODO Auto-generated method stub

//	Person p = new Person();
//	Class clazz = p.getClass();
//	Person p1 = new Person();
//	Class clazz1 = p.getClass();
//	System.out.println(clazz);
//	Class clazz = Person.class;
	Class clazz = Class.forName("clf.reflect.demo.Person");	
	System.out.println(clazz);
    }

}
