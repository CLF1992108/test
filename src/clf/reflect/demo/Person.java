package clf.reflect.demo;

public class Person {

    private String name;
    private int age;
    public Person(String name, int age) {
	super();
	this.name = name;
	this.age = age;
	System.out.println("带参构造函数:"+name+":"+age);
    }
    public Person() {
	super();
	// TODO Auto-generated constructor stub
	System.out.println("默认构造函数");
    }
    
    private void method(){
	
	System.out.println("私有方法");
    }
    public void paramMethod(String name,int age){
	
	System.out.println(name+"带参数方法"+age);
    }
    public void show(){
	
 	System.out.println("公有方法");
    }
    public static void show1(){
	
 	System.out.println("静态公有方法");
    }
}
