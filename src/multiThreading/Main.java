package multiThreading;

import com.sun.webkit.ThemeClient;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.*;
import static java.util.stream.IntStream.range;

public class Main {

    private static final String MESSAGE_TEMPLATE_THREAD_STATE = "%s : %s\n";
    private static final int INCREMENT_COUNT = 1000;

    public static void main(String[] args) throws InterruptedException {
        List<Thread> threadList = new ArrayList<>();
//        for (int i = 0; i <= 10; i++) {
//            Thread thread = new Thread(new MyRunnable());
//            showThreadState(thread);
//            thread.start();
//            threadList.add(thread);
////            showThreadState(thread);
//        }
//        for (Thread thread : threadList) {
//            showThreadState(thread);
//        }

//        Counter counter = new Counter();
//        for (int i = 0; i <= 100; i++) {
//            Thread thread = createCountIncrementInThread(INCREMENT_COUNT);
//            thread.start();
//        }
//        out.println(counter.getCount());

        OneThread oneThread = new OneThread();
        AnotherThread anotherThread = new AnotherThread();
        oneThread.start();
        anotherThread.start();
    }


    private static void showThreadState(final Thread thread) {
        out.printf(String.format(MESSAGE_TEMPLATE_THREAD_STATE, thread.getName(), thread.getState()));
    }

    private static Thread createCountIncrementInThread(final int incrementAmount) {
        return new Thread(() -> range(0, incrementAmount).forEach(i -> Counter.increment()));
    }


    static Object lock = new Object();
    public static class OneThread extends Thread {
        @Override
        public void run() {
            while (true) {
               synchronized(lock){
                   try {
                       lock.wait();
                   } catch (InterruptedException e) {
                       throw new RuntimeException(e);
                   }
                   out.println("Thread name is " + Thread.currentThread().getName());
               }
            }
        }
    }
    public static class AnotherThread extends Thread {
        @Override
        public void run() {
            while (true) {
                synchronized (lock){
                    out.println("Thread name is " + Thread.currentThread().getName());
                    lock.notify();
                }
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

}
