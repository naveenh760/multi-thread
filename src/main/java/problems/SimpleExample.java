package problems;

public class SimpleExample {
    public static int count = 0;
    static Object key = new Object();

    public static void incrementCount(){
        synchronized(key){
            count = count + 1;
        }
    }

    public static void main(String[] args){
        Runnable runnable = () -> incrementCount();

        for(int i = 0 ; i < 1000; i++){
            Thread t = new Thread(runnable);
            t.start();
        }

        System.out.println(count);
    }

}
