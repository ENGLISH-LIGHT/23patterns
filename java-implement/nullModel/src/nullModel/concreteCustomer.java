package nullModel;

public class concreteCustomer implements customer {
    private String name;
    public concreteCustomer(String name){
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }
}
