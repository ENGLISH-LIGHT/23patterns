package command;

//requirment
public class demand implements task{
//    coding mankey
    private programmer monkey = null;
    public void handle() {
        System.out.println(toString());
        monkey.handleDemand();
    }
    public demand(programmer monkey){
        this.monkey = monkey;
    }
    @Override
    public String toString() {
        return "Demand [programmer = " + monkey.getName() + "]";
    }
}
