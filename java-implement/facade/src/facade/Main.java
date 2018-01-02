package facade;

public class Main {

    public static void main(String[] args) {
        concrete tmp = new concrete();
        System.out.println("---------------------");
        tmp.function12();
        System.out.println("---------------------");
        tmp.function23();
        System.out.println("---------------------");
        tmp.function123();
        System.out.println("---------------------");
    }
}
