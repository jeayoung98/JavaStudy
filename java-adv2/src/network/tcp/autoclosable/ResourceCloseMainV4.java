package network.tcp.autoclosable;

public class ResourceCloseMainV4 {

    public static void main(String[] args) {
        try {
            logic();
        } catch (CallException e) {
            System.out.println("CallException 예외 처리");
            Throwable[] suppressed = e.getSuppressed();
            for (Throwable throwable : suppressed) {
                System.out.println("suppressedEx = " + throwable);
            }
            e.printStackTrace();
        }catch (CloseException e) {
            System.out.println("CloseException 예외 처리");
            e.printStackTrace();
        }
    }

    private static void logic() throws CloseException, CallException {
        try (ResourceV2 resource1 = new ResourceV2("resource1");
             ResourceV2 resource2 = new ResourceV2("resource2")) {

            resource1.call();
            resource2.callEx(); // CallException
        } catch (CallException e) {
            System.out.println("ex : " + e);
            throw e;
        }
    }
}
