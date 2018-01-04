package strategy;

public class Main {

    public static void main(String[] args) {
        context t = new context(new add());
        System.out.println(t.excuteStrategy(6,3));
        t = new context(new sub());
        System.out.println(t.excuteStrategy(6,3));
        t = new context(new multi());
        System.out.println(t.excuteStrategy(6,3));
    }
}
