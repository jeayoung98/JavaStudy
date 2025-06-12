package thread.executor.test;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class NewOrderService {
    public void order(String orderNo) throws Exception {
        // callable 로 변경 해야됨
        ExecutorService es = Executors.newFixedThreadPool(3);

        List<Future<Boolean>> futures = es.invokeAll(List.of(new InventoryWork(orderNo), new ShippingWork(orderNo), new AccountingWork(orderNo)));

        boolean isCompleted = true;
        for (Future<Boolean> future : futures) {
            if (!future.get()){
                log("일부 작업이 실패했습니다.");
                isCompleted = false;
                break;
            }
        }
        if (isCompleted) log("모든 주문 처리가 성공적으로 완료되었습니다.");
        es.close();
    }

    static class InventoryWork implements Callable<Boolean> {
        private final String orderNo;

        public InventoryWork(String orderNo) {
            this.orderNo = orderNo;
        }

        @Override
        public Boolean call() throws Exception {
            log("재고 업데이트: " + orderNo);
            sleep(1000);
            return true;

        }
    }

    static class ShippingWork implements Callable<Boolean>{
        private final String orderNo;

        public ShippingWork(String orderNo) {
            this.orderNo = orderNo;
        }

        @Override
        public Boolean call() {
            log("배송 시스템 알림: " + orderNo);
            sleep(1000);
            return true;
        }
    }

    static class AccountingWork implements Callable<Boolean> {
        private final String orderNo;

        public AccountingWork(String orderNo) {
            this.orderNo = orderNo;
        }

        @Override
        public Boolean call() {
            log("회계 시스템 업데이트: " + orderNo);
            sleep(1000);
            return true;
        }
    }
}