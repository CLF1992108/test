package clf.reflect.demo;

public class Person {

    private String name;
    private int age;
    public Person(String name, int age) {
	super();
	this.name = name;
	this.age = age;
	System.out.println("���ι��캯��:"+name+":"+age);
    }
    public Person() {
	super();
	// TODO Auto-generated constructor stub
	System.out.println("Ĭ�Ϲ��캯��");
    }
    
    private void method(){
	
	System.out.println("˽�з���");
    }
    public void paramMethod(String name,int age){
	
	System.out.println(name+"����������"+age);
    }
    public void show(){
	
 	System.out.println("���з���");
    }
    public static void show1(){
	
 	System.out.println("��̬���з���");
    }
}
