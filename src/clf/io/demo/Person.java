package clf.io.demo;

import java.io.Serializable;

public class Person implements Serializable{

    private static final long serialVersionUID = 4215571913332681660L;
    private transient String name;
  
    private static int age;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public Person(String name, int age) {
	super();
	this.name = name;
	this.age = age;
    }
    
}
