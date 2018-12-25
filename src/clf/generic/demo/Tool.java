package clf.generic.demo;

public class Tool<M> {

    private M m;

    public M getM() {
        return m;
    }

    public void setM(M m) {
        this.m = m;
    }
    
    public static <E> void show(E e){
	
	System.out.println("M:"+e);
    }

    public <X> void print(X m){
	
	System.out.println("M:"+m);
    }
}
