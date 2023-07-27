package multiThreading;

public final class Counter {

   static  int count = 0;

    public static synchronized void increment() {
        count = count + 1;
    }

    public int getCount() {
        return count;
    }
}
