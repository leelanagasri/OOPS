abstract class Abst1{
    abstract void meth1();
    public void meth2(){
        System.out.println("concrete method includes an implementation in its body.");
    }
} 
public class Abst extends Abst1{
	public static void main(String[] args) {
		Abst m = new Abst();
		m.meth1();
		m.meth2();
	}
	void meth1(){
	    System.out.println("abstract method implemented in child class.");
	}
}