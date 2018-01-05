package compositeEntity;

public class Main {

    public static void main(String[] args) {
        client c1 = new client();
        client c2 = new client();
        c1.setData("hello","world");
        c2.setData("good","nice");
        c1.printData();
        c2.printData();
    }
}
