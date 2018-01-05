package frontController;

public class dispatcher {
    private homeView homeview;
    private stuView stuview;
    public dispatcher(){
        homeview = new homeView();
        stuview = new stuView();
    }
    public void dispatch(String request){
        if (request.equalsIgnoreCase("STUDENT")){
            stuview.show();
        }
        else{
            homeview.show();
        }
    }
}
