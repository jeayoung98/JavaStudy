package network.tcp.autoclosable;

public class ResourceCloseMainV2 {

    public static void main(String[] args) {
        try {
            logic();
        } catch (CallException e) {
            System.out.println("CallException 예외 처리");
            throw new RuntimeException(e);
        }catch (CloseException e) {
            System.out.println("CloseException 예외 처리");
            throw new RuntimeException(e);
        }
    }

    private static void logic() throws CloseException, CallException {
        ResourceV1 resource1 = null;
        ResourceV1 resource2 = null;

        try {
            resource1 = new ResourceV1("resource1");
            resource2 = new ResourceV1("resource2");

            resource1.call();
            resource2.callEx(); // CallException
        } catch (CallException e) {
            System.out.println("ex: " + e);
            throw e;
        } finally {
            if(resource2 != null) resource2.closeEx();
            if(resource1 != null) resource1.closeEx();
            System.out.println("자원정리");
            resource2.closeEx();
            resource1.closeEx(); // 이 코드 호출 안됨
        }




    }
}
