package sample1;

public class PrintStringsThread implements Runnable {
	Thread thread;
	String str1, str2;
	public PrintStringsThread(String str1, String str2) {
		this.str1 = str1;
		this.str2 = str2;
		thread = new Thread(this);
		thread.start();
	}
	
	public void run() {
	   PrintStrings.printSynch(str1, str2);	
	}
	
	

}
