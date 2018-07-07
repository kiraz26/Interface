package warmup;

public class BikeMain {

	public static void main(String[] args) {
		MountainBike mb1 = new MountainBike("Bisan", 24);
		mb1.gear = 24;
		mb1.name = "Bisan";

		mb1.rideOnMountain();
		mb1.stepOnPaddle();
		mb1.changeDirection("right");
		mb1.speedUp();
		
		mb1.flip();
		mb1.jump();
		
		mb1.startTheBike();
		mb1.stopTheBike();

	}

}
