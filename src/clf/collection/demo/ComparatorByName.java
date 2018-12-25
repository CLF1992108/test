package clf.collection.demo;

import java.util.Comparator;

public class ComparatorByName implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
	//TODO Auto-generated method stub
//	if(!(o1 instanceof Person) && !(o2 instanceof Person))
//	    throw new ClassCastException("¿‡–Õ¥ÌŒÛ");
//	Person p1 = (Person)o1;
//	Person p2 = (Person)o2;
	int temp = o1.getName().compareTo(o2.getName());
	
	return temp == 0 ? o1.getAge() - o2.getAge() : temp;
	
    }

}
