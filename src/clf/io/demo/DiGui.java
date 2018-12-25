package clf.io.demo;

public class DiGui {

    public static void main(String[] args) {
	//TODO Auto-generated method stub
	//toBin(6);
	int sum = getSum(10000);
	System.out.println(sum);
    }

    public static int getSum(int i) {
	//TODO Auto-generated method stub
	if(i==1)
	    return 1;
	return i+getSum(i-1);
    }

    public static void toBin(int i) {
	//TODO Auto-generated method stub
	int temp = i % 2;
	System.out.println(temp);
	i = i /2;
	if(i != 0){
	    toBin(i);
	}
    }

}
