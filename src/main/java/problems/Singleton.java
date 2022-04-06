package problems;

public class Singleton {
	
	private Singleton() {
		System.out.println("Inside constructor");
	}
	
	private static Singleton instance;

	public static Singleton getInstanceNonSynch() {
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
	}

	synchronized public static Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
	}



	public static void main(String[] args) {
		Runnable runnable = () -> getInstanceNonSynch();
		Runnable runnable1 = () -> getInstance();
		for(int i = 0; i < 100 ; i++){
			Thread t = new Thread(runnable1);
			t.start();
		}
	}

}
