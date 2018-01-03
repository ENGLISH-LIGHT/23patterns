package command;

public class problem implements task {
    private programmer monkey = null;
    public problem(programmer monkey){
        this.monkey = monkey;
    }

    @Override
    public void handle() {
        System.out.println(toString());
        monkey.handleProblem();
    }

    @Override
    public String toString() {
        return "Problem [programmer = " + monkey.getName() + "]";
    }
}
