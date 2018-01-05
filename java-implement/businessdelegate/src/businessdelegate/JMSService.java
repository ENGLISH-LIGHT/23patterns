package businessdelegate;

public class JMSService implements businessService {
    @Override
    public void processing() {
        System.out.println("Processing task by invoking JMS Service");
    }
}
