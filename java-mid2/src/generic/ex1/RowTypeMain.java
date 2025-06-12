package generic.ex1;

public class RowTypeMain {
    public static void main(String[] args) {
        GenericBox integerBox = new GenericBox();
//        GenericBox<Object> integerBox = new GenericBox<>(); // 권장
        integerBox.setValue(10);
        System.out.println("integerBox = " + integerBox);
    }
}
