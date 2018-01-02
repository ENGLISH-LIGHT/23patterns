package prototype;

public class Main {
    public static void main(String[] args) {
        shapecache.loadCache();
        shape shape1 = (shape) shapecache.getShape("1");
        System.out.println("shape:"+shape1.getType());
        shape shape2 = (shape) shapecache.getShape("2");
        System.out.println("shape:"+shape2.getType());
        shape shape3 = (shape) shapecache.getShape("3");
        System.out.println("shape:"+shape3.getType());
    }
}
