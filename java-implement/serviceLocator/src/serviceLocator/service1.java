package serviceLocator;

public class service1 implements service{
    @Override
    public String getName() {
        return "service1";
    }

    @Override
    public void execute() {
        System.out.println("Executing service1");
    }

}
