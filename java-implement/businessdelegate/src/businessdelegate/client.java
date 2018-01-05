package businessdelegate;

public class client {
    private businessDelegate delegate;
    public client(businessDelegate delegate){
        this.delegate =delegate;
    }
    public void doTask(){
        this.delegate.doTask();
    }
}
