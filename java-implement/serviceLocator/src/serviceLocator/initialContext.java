package serviceLocator;

public class initialContext {
    public Object lookup(String jndiName){
        if (jndiName.equalsIgnoreCase("service1")){
            System.out.println("Looking up and creating a new Service1 object");
            return new service1();
        }
        else if (jndiName.equalsIgnoreCase("service2")){
            System.out.println("Looking up and creating a new Service2 object");
            return new service2();
        }
        return null;
    }
}
