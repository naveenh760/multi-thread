package sample1;

public class RunnableEx implements Runnable {

	public RunnableEx() {
		Thread t1 = new Thread(this);
		t1.start();
	}

	@Override
	public void run() {
		System.out.println("Sairam");
		
	}
	

}
