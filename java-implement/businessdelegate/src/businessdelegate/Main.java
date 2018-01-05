package businessdelegate;

public class Main {

    public static void main(String[] args) {
        businessDelegate delegate = new businessDelegate();
        delegate.setServerType("EJB");
        client c = new client(delegate);
        delegate.doTask();
        c.doTask();
        System.out.println("---------------------------------------");
        businessDelegate delegate1 = new businessDelegate();
        delegate1.setServerType("others");
        client c1 = new client(delegate1);
        delegate1.doTask();
        c1.doTask();
        System.out.println("---------------------------------------");
    }
}
