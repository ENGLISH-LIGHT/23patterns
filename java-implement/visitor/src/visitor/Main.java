package visitor;

public class Main {

    public static void main(String[] args) {
        objectStructure os = new objectStructure();
        os.attachA(new elementA("A1"));
        os.attachA(new elementA("A2"));
        os.attachA(new elementA("A3"));
        os.attachA(new elementA("A4"));
        os.attachB(new elementB("B1"));
        os.attachB(new elementB("B2"));

        System.out.println("--------------------------------------");
        os.accept(new visitorA("小A"));
        System.out.println("--------------------------------------");
        os.accept(new visitorB("小B"));
        System.out.println("--------------------------------------");
        os.acceptA(new visitorA("小A"));
        System.out.println("--------------------------------------");
        os.acceptB(new visitorB("小B"));
    }
}
