package observer;

public class Main {

    public static void main(String[] args) {
        subject sub1 = new subject();
        new binaryObserver(sub1);
        new octalObserver(sub1);
        new hexaObserver(sub1);

        System.out.println("-------------------------");
        sub1.setState(15);
        System.out.println("-------------------------");
        sub1.setState(10);
    }
}
