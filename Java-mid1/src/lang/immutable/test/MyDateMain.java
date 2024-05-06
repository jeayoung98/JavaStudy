package lang.immutable.test;

public class MyDateMain {
    public static void main(String[] args) {
        MyDate myDate = new MyDate(2024, 5, 6);
        MyDate myDate1 = myDate;
        System.out.println("myDate = " + myDate);
        System.out.println("myDate1 = " + myDate1);

        System.out.println("2025 -> mydate");
        MyDate newMyDate = myDate.withYear(2025);
        System.out.println("myDate = " + newMyDate);
        System.out.println("myDate1 = " + myDate1);
    }
}
