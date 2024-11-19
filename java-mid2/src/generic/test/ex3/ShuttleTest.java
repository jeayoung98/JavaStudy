package generic.test.ex3;

public class ShuttleTest {
    public static void main(String[] args) {
        Shuttle<Marine> shuttle1 = new Shuttle<>();
        shuttle1.in(new Marine("마린", 40));
        shuttle1.showInfo();

        Shuttle<Zergling> shuttle2 = new Shuttle<>();
        shuttle2.in(new Zergling("저글링", 35));
        shuttle1.showInfo();

        Shuttle<Zealot> shuttle3 = new Shuttle<>();
        shuttle3.in(new Zealot("즐럿", 150));
        shuttle1.showInfo();
    }
}
