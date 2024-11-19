package generic.test.ex3;

public class UnitPrinter {

    public static<T extends BioUnit> void printV1(Shuttle<T> shuttle) {
        shuttle.showInfo();
    }

    public static void printV2(Shuttle<? extends BioUnit> shuttle) {
        shuttle.showInfo();
    }
}
