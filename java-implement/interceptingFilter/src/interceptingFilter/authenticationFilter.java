package interceptingFilter;

public class authenticationFilter implements filter{
    @Override
    public void execute(String request) {
        System.out.println("Authenticating request: " + request);
    }
}
