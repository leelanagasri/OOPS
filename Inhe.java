

class One{
	int speed;
	String vehicletype;
	public One(int speed, String type) {
		this.speed = speed;
		this.vehicletype = type;
	}
	public String toString() {
		return "The type of Vehicle is "+ vehicletype + "Speed is "+speed;
	}
}
class Two extends One{
	String movement;
	public Two(int speed, String vehicletype, String mm){
		super(speed,vehicletype);
		this.movement = mm;
	}
	public String toString() {
		return "The type of Vehicle is "+ vehicletype + "\nSpeed is "+speed+ "\nThe movement is "+movement;
	}
}
public class Inhe {
	public static void main(String[] args) {
		One tt2 = new One(70, "Jeep");
		System.out.println(tt2);
		One tt1= new Two(30, "Bike", "Moving");
		System.out.println(tt1);
		Two tt = new Two(50, "car", "stopped");
		System.out.println(tt);
		
	}
}
