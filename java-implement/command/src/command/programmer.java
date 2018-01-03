package command;

//receivor of the certain command
public class programmer {
    private String name;
    public programmer(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void handleDemand(){
        System.out.println("Coder : " + name + " is handling this demand");
    }
    public void handleBug(){
        System.out.println("Coder : " + name + " is handling this bug");
    }
    public void handleProblem(){
        System.out.println("Coder : " + name + " is handling this problem");
    }
}
