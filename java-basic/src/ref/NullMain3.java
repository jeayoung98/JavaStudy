package ref;

public class NullMain3 {
    public static void main(String[] args) {
        BigData bIgData = new BigData();
        System.out.println("bigData.count = " + bIgData.count);
        System.out.println("bigData.data = " + bIgData.data);

        // NullPointerException
        System.out.println("bigData.data.value"+bIgData.data.value);
    }
}
