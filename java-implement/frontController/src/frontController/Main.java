package frontController;

public class Main {

    public static void main(String[] args) {
        dispatcher d = new dispatcher();
        d.dispatch("STUDENT");
        d.dispatch("STU");
    }
}
