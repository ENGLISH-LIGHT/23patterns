package businessdelegate;

public class businessLookUp {
    public businessService getServer(String serverType){
        if (serverType.equalsIgnoreCase("EJB")){
            return new EJBService();
        }
        return new JMSService();
    }
}
