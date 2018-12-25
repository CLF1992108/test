package clf.io.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectStreamDemo {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
	//TODO Auto-generated method stub

	//writeObj();
	readObj();
	
    }

    public static void readObj() throws ClassNotFoundException, IOException {
	//TODO Auto-generated method stub
	ObjectInputStream ois = new ObjectInputStream(new FileInputStream("obj.object"));
	Person p = (Person)ois.readObject();
	System.out.println(p.getName()+":"+p.getAge());
	ois.close();
    }

    private static void writeObj() throws IOException, FileNotFoundException {
	ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("obj.object"));
	
	oos.writeObject(new Person("ÕÅÈý",20));
	
	oos.close();
    }

}
