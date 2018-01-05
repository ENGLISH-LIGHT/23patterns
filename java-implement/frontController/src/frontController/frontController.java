package frontController;

public class frontController {
    private dispatcher dis;
    public frontController(){
        dis = new dispatcher();
    }
    private boolean isAuthenticUser(){
        System.out.println("User is authenticated successfully");
        return true;
    }
    private void trackRequest(String request){
        System.out.println("Page request: " + request);
    }
    public void dispatchRequest(String request){
        trackRequest(request);
        if (isAuthenticUser()){
            dis.dispatch(request);
        }
    }
}
