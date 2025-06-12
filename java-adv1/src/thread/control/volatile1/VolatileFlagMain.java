package thread.control.volatile1;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class VolatileFlagMain {
    public static void main(String[] args) {
        MyTask task = new MyTask();
        Thread t = new Thread(task, "work");
        log("runFlag = " + task.runFlag);
        t.start();

        sleep(1000);
        task.runFlag = false;
        log("runFlag = " + task.runFlag);
        log("main 종료");
    }

    static class MyTask implements Runnable {
//        boolean runFlag = true; // 캐시 메모리
         volatile boolean runFlag = true; // 메인 메모리
        @Override
        public void run() {
            log("task 시작");
            while (runFlag) {
                // runFlag 가 false로 변하면 탈출
            }
            log("task 종료");
        }
    }
}
