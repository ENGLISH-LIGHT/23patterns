package command;

public class bug implements task {
    private programmer monkey = null;
    public bug(programmer monkey){
        this.monkey = monkey;
    }

    @Override
    public void handle() {
        System.out.println(toString());
        monkey.handleBug();
    }

    @Override
    public String toString() {
        return "Bug [programmer = " + monkey.getName() + "]";
    }
}
