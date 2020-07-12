package sample1;

public class PrintStrings {

	public static void print(String str1, String str2) {
		System.out.println(str1);
		try {
			Thread.sleep(500);
		}
		catch( InterruptedException e) {
			System.out.println(e);
		}
		System.out.println(str2);
	}
	
	synchronized public static void printSynch(String str1, String str2) {
		System.out.println(str1);
		try {
			Thread.sleep(500);
		}
		catch( InterruptedException e) {
			System.out.println(e);
		}
		System.out.println(str2);
	}
}
