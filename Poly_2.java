// Method Overriding
class Sample{
	public void wash(String p) {
		System.out.println("The Surf powder name in Sample class is "+p);
	}
}
class Sample2 extends Sample{
	public void wash(String p) {
		System.out.println("The Surf powder name in Sample class2 is "+p);
	}
}
public class Poly_2 {
	public static void main(String[] args) {
		Sample ob1 = new Sample();
		ob1.wash("Surf Excel");
		Sample ob2 = new Sample2();
		ob2.wash("Rin");
		Sample2 ob3 = new Sample2();
		ob3.wash("Tide");
	}
}
