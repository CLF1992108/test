package clf.reflect.demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectDemo2 {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
	//TODO Auto-generated method stub

	createNewObject();
	
	
    }
    public static void createNewObject2() throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
	//TODO Auto-generated method stub
	Class clazz = Class.forName("clf.reflect.demo.Person");
	Constructor c = clazz.getConstructor(String.class,int.class);
	Object obj = c.newInstance("zhangsan",2);
	System.out.println(obj);
    }
    public static void createNewObject() throws ClassNotFoundException, InstantiationException, IllegalAccessException{
	Class clazz = Class.forName("clf.reflect.demo.Person");
	Object obj = clazz.newInstance();
	System.out.println(obj);
	
    }

}
