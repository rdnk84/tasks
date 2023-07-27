package multiThreading;

public class MyRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("state inside run " + Thread.currentThread().getState());
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "-" + i );
        }

    }

}
