package clf.reflect.demo;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectDemo3 {

    public static void main(String[] args) throws Exception {
	//TODO Auto-generated method stub

	//getFieldMethod();
	getMethodDemo();
    }

    public static void getMethodDemo() throws Exception {
	//TODO Auto-generated method stub
	Class clazz = Class.forName("clf.reflect.demo.Person");
//	Method[] ms = clazz.getDeclaredMethods();
//	for(Method m : ms){
//	    System.out.println(m);
//	}
	Method m = clazz.getMethod("paramMethod", String.class, int.class);

	System.out.println(m);
	
	Object obj = clazz.newInstance();
	m.invoke(obj, "ะกร๗", 2);
	
	
    }

    public static void getFieldMethod() throws Exception {
	//TODO Auto-generated method stub
	
	Class clazz = Class.forName("clf.reflect.demo.Person");
	Object obj = clazz.newInstance();
	Field f = clazz.getDeclaredField("age");
	f.setAccessible(true);
	f.set(obj, 8);
	System.out.println(f);
	Object o = f.get(obj);
	
	System.out.println(o);
	
    }

}
