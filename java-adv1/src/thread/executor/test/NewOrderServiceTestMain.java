package thread.executor.test;

public class NewOrderServiceTestMain {
    public static void main(String[] args) throws Exception {
        String orderNo = "Order#1234"; // 예시 주문 번호
        NewOrderService newOrderService = new NewOrderService();
        newOrderService.order(orderNo);
    }
}