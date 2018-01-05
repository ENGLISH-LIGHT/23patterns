package serviceLocator;

public class service2 implements service{
    @Override
    public String getName() {
        return "service2";
    }

    @Override
    public void execute() {
        System.out.println("Executing service2");
    }
}
