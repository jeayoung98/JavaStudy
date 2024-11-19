package generic.test.ex2;

public class PariTest {
    public static void main(String[] args) {
        Pair<Integer, String> pair1 = new Pair<>();
        pair1.setKey(1);
        pair1.setValue("data");
        System.out.println(pair1.getKey());
        System.out.println(pair1.getValue());
        System.out.println("pair1 = " + pair1);

        Pair<String, String> pair2 = new Pair<>();
        pair2.setKey("key");
        pair2.setValue("value");
        System.out.println(pair2.getKey());
        System.out.println(pair2.getValue());
        System.out.println("pair2 = " + pair2);
    }
}
