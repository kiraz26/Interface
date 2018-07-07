package warmup;

public interface SuperBike {
	
	public abstract void flip();
	
	int jump(); // it is automatically public abstract int jump();
	
	default void doSuperStuff() {
		System.out.println("do super stuff: superbike interface");
	}
	
	static void racing() {
		System.out.println("Super race in SuperBike");
	}
	
}
