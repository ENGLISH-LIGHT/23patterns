package nullModel;

public class nullCustomer implements customer {
    private String name;
    public nullCustomer(String name){
        this.name = name;
    }

    @Override
    public String getName() {
        return "This name is not existed in database!";
    }
}
