package businessdelegate;

public class businessDelegate {
    private businessLookUp lookUp = new businessLookUp();
    private businessService service;
    private String serverType;
    public void setServerType(String serverType) {
        this.serverType = serverType;
    }
    public void doTask(){
        service = lookUp.getServer(serverType);
        service.processing();
    }
}
