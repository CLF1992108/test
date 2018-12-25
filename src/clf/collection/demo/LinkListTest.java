package clf.collection.demo;

public class LinkListTest {

    public static void main(String[] args) {
	// TODO Auto-generated method stub

	DuiLie dl = new DuiLie();
	dl.myAdd("asd1");
	dl.myAdd("asd2");
	dl.myAdd("asd3");
	dl.myAdd("asd4");

	while (!dl.myIsEmpty()) {
	    System.out.println(dl.myGet());
	}
    }

}
