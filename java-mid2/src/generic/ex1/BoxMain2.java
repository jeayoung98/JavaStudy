package generic.ex1;

public class BoxMain2 {
    public static void main(String[] args) {
        ObjectBox objectBox = new ObjectBox();
        objectBox.setObject(10);
        System.out.println(objectBox.getObject());

        objectBox.setObject("hello");
        System.out.println(objectBox.getObject());
    }
}
