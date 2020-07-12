package sample1;

import problems.OddEvenRunnable;

public class Mainpgm {

	public static void main(String[] args) throws InterruptedException {
		// extendThreadEx();
		// implementRunnableEx();
//	 implementRunnableAnoClass();	
	implementRunnableLambda();
		// printStringsLambda();
	//	printStringsEx();
		// printOddEven();

	}

	public static void extendThreadEx() {
		for (int i = 0; i < 10; i++) {
			MultiThreadEx instance = new MultiThreadEx();
			instance.start();
		}
	}

	public static void implementRunnableEx() {
		for (int i = 0; i < 5; i++) {
			RunnableEx instance = new RunnableEx();
		}
	}

	public static void implementRunnableAnoClass() throws InterruptedException {
		for (int i = 0; i < 5; i++) {
			Thread t1 = new Thread(new Runnable() {

				@Override
				public void run() {
					System.out.println("Sairam");

				}
			});
			t1.start();
			t1.join();
		}
	}

	public static void implementRunnableLambda() {
		for (int i = 0; i < 5; i++) {
			Thread t1 = new Thread(() -> {
				System.out.println("Sairam");
				System.out.println("Hello");
			});
			t1.start();
		}
	}

	public static void printStringsEx() {
		new PrintStringsThread("Hello ", "There");
		new PrintStringsThread("How are", "you");
		new PrintStringsThread("Thank you", "very much");
	}

	public static void printStringsLambda() {
		Thread t1 = new Thread(() -> PrintStrings.print("Hello ", "There"));
		Thread t2 = new Thread(() -> PrintStrings.print("How are", "you"));
		t1.start();
		t2.start();
	}

	public static void printOddEven() {
		OddEvenRunnable oddRunnable = new OddEvenRunnable(1);
		OddEvenRunnable evenRunnable = new OddEvenRunnable(0);

		Thread t1 = new Thread(oddRunnable, "Odd");
		Thread t2 = new Thread(evenRunnable, "Even");

		t1.start();
		t2.start();

	}

}
