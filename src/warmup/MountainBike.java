package warmup;

public class MountainBike implements Bike {
	int gear;
	String name;
	
	public MountainBike() {
		
	}
	
	public MountainBike(String name, int gear) {
		this.name = name;
		this.gear = gear;
		System.out.println(Bike.BIKENAME);
	}

	public void rideOnMountain() {
		System.out.println(Motorcycle.BIKENAME + " riding on mountain");
	}

	// Overriding rule
	// 1)the method needs to have same method signature + same return type or sub
	// type
	// 2)it should not have less visible access modifier
	@Override
	public void stepOnPaddle() {
		System.out.println("step on paddle");
	}

	@Override
	public void changeDirection(String direction) {
		System.out.println("change direction to " + direction);
	}

	@Override
	public void speedUp() {
		System.out.println("speed up");
	}

	@Override
	public void flip() {
		System.out.println("Yavas mk");
		
	}

	@Override
	public int jump() {
		// TODO Auto-generated method stub
		return 3;
	}
	
	@Override
	public void startTheBike() {
		
	}

	public static void main(String[] args) {
		MountainBike mb1 = new MountainBike();
		mb1.doSuperStuff(); // it will come from close one (Bike interface)
		SuperBike.racing();
		Bike.racing();
		
		
	}

	

}
