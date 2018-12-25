package clf.collection.demo;

public class Person implements Comparable<Person>{

   
	private String name;
	private int age;
	public Person() {
	    super();
	    // TODO Auto-generated constructor stub
	}
	@Override
	public int hashCode() {
	    //TODO Auto-generated method stub
	    System.out.println(this+"......HashCode......");
	    return name.hashCode()+age*31;
	}
	@Override
	public boolean equals(Object obj) {
	    //TODO Auto-generated method stub
	    System.out.println("asds");
	    Person p = (Person)obj;
	    if(this == obj){
		System.out.println("对象相同");
		return true;
	    }
	    if(!(obj instanceof Person)){
		throw new ClassCastException("类型错误");
	    }
	    
	   // System.out.println(this+"......equals......");
	    return this.name.equals(p.getName()) && this.age == p.getAge();
	}
	
	@Override
	public String toString() {
	    //TODO Auto-generated method stub
	    return this.name+":"+this.age;
	}
//	@Override
//	public int hashCode() {
//	    final int prime = 31;
//	    int result = 1;
//	    result = prime * result + age;
//	    result = prime * result + ((name == null) ? 0 : name.hashCode());
//	    return result;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//	    if (this == obj)
//		return true;
//	    if (obj == null)
//		return false;
//	    if (getClass() != obj.getClass())
//		return false;
//	    Person other = (Person) obj;
//	    if (age != other.age)
//		return false;
//	    if (name == null) {
//		if (other.name != null)
//		    return false;
//	    } else if (!name.equals(other.name))
//		return false;
//	    return true;
//	}

	public Person(String name, int age) {
	    super();
	    this.name = name;
	    this.age = age;
	    
	}
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
	@Override
	public int compareTo(Person p) {
	    //TODO Auto-generated method stub
	   
	    int s = this.age - p.age == 0 ? this.name.compareTo(p.name) : this.age - p.age;
	    return s;
	}
	
   

}
