package serviceLocator;

import java.util.ArrayList;
import java.util.List;

public class cache {
    private List<service>serviceList;
    public cache(){
        serviceList = new ArrayList<service>();
    }
    public service getService(String serviceName){
        for (service e : serviceList){
            if (e.getName().equalsIgnoreCase(serviceName)) {
                System.out.println("Returning cached " + serviceName + " object");
                return e;
            }
        }
        return null;
    }
    public void addService(service e){
        boolean exists = false;
        for (service s : serviceList){
            if(s.getName().equalsIgnoreCase(e.getName())){
                exists = true;
            }
        }
        if(!exists){
            serviceList.add(e);
        }
    }
}
