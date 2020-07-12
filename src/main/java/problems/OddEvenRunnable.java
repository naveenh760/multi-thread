package problems;

public class OddEvenRunnable implements Runnable {
    public int MAX_NUM = 10;
    static int number = 1;
    int remainder;
    static Object lock = new Object();
    
    
    
	public OddEvenRunnable(int remainder) {
		this.remainder = remainder;
	}



	@Override
	public void run() {
		while(number < MAX_NUM) {
			synchronized(lock) {
				while(number % 2 != remainder) {
					try {
						lock.wait();
					}
					catch(InterruptedException e) {
						
					}
				}
				System.out.println(Thread.currentThread().getName() + " " + number);
				number++;
				lock.notifyAll();
			}
		}

	}

}
