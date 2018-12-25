package clf.generic.demo;

public interface InterfaceDemo <T>{

    public void show(T t);
}

class InterImpl implements InterfaceDemo<String>{
    
    public void show(String t){
	System.out.println(t);
    }
}

class InterImpl2<T> implements InterfaceDemo<T>{
    
    public void show(T t){
	System.out.println(t);
    }
}
