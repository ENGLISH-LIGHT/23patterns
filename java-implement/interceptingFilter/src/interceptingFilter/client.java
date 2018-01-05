package interceptingFilter;

public class client {
    filterManger manger;
    public void setFilterManager(filterManger manager){
        this.manger = manager;
    }
    public void sendRequest(String request){
        manger.filterRequest(request);
    }
}
