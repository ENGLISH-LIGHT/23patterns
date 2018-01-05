package interceptingFilter;

public class debugFilter implements filter{
    @Override
    public void execute(String request) {
        System.out.println("request log: " + request);
    }
}
