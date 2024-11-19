package thread.start.test;

import static java.lang.Thread.sleep;
import static util.MyLogger.log;

public class StartTestMain2 {
    public static void main(String[] args) {
        Thread thread = new Thread(new CounterRunnable(),"count");
        thread.start();
    }

    static class CounterRunnable implements Runnable{
        @Override
        public void run() {
            for (int i = 1; i <= 5; i++) {
                log("value : " + i);
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        }
    }
}
