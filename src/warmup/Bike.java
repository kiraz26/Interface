package warmup;

public interface Bike extends SuperBike, Motorcycle{

	public static final String BIKENAME = "Bike";

	void stepOnPaddle(); // public abstract will come automatically

	public abstract void changeDirection(String direction);

	public abstract void speedUp();
	
	public default void startTheBike() {
		System.out.println("this is default: starting");
	}
	default void stopTheBike() { // public will come automatically: public default void stopTheBike()
		System.out.println("this is default: stopping");
	}
	
	default void doSuperStuff() {
		System.out.println("do super stuff: bike interface");
	}
	
	static void racing() {
		System.out.println("Super race in Bike");
	}

	

}
