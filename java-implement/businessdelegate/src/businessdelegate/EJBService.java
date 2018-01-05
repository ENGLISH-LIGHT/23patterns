package businessdelegate;

public class EJBService implements businessService {
    @Override
    public void processing() {
        System.out.println("Processing task by invoking EJB Service");
    }
}
