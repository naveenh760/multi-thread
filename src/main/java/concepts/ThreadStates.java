package concepts;

public class ThreadStates {

	public static void main(String[] args) {

		Runnable runnable = () -> {
			System.out.println("I am running in " + Thread.currentThread().getName());
		};

		Thread t = new Thread(runnable,"test thread");
		System.out.println(t.getState());
		t.start();
		System.out.println(t.getState());
		try {
			t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(t.getState());
	}

}