package serviceLocator;

public class serviceLoctator {
    private static cache c;
    static {
        c = new cache();
    }
    public static service getService(String jndiName){
        service s = c.getService(jndiName);
        if(s == null){
            initialContext context = new initialContext();
            s = (service) context.lookup(jndiName);
            c.addService(s);
        }
        return s;
    }
}
