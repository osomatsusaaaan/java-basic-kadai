package kadai_015;

public class CarExec_Chapter15 {
	public static void main(String[] args) {
		
		car_Chapter15 gear = new car_Chapter15(1, 10);
		car_Chapter15 speed = new car_Chapter15(1, 30);
		
		gear.gearChange(1);
		
		speed.run();
	}
}
