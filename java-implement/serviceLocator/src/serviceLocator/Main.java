package serviceLocator;

public class Main {

    public static void main(String[] args) {
        service s = serviceLoctator.getService("service1");
        s.execute();
        s = serviceLoctator.getService("service2");
        s.execute();
        System.out.println("----------------------------------");
        s = serviceLoctator.getService("service1");
        s.execute();
        s = serviceLoctator.getService("service2");
        s.execute();
    }
}
