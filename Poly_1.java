// Method Overloading
class First{
	public void print1(int a, int b){
		int sum = a*b;
		System.out.println("The Integer sum is "+sum);
	}
	public void print1(double a, int b) {
		double sum = a*b;
		System.out.println("The Double sum is "+sum);
	}
}
public class Poly_1 {
	public static void main(String[] args) {
		First obj = new First();
		obj.print1(5, 86);
		obj.print1(5.0765, 59);
	}
}
