package problems;

public class Singleton {
	
	private Singleton() {
		System.out.println("Inside constructor");
	}
	
	private static Singleton instance;
	synchronized public static Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
	

	public static void main(String[] args) {
		Thread t1 = new Thread(() -> getInstance());
		Thread t2 = new Thread(() -> getInstance());
		t1.start();
		t2.start();
	}

}
