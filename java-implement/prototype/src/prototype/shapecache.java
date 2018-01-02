package prototype;

import java.util.Hashtable;

public class shapecache {
    private  static Hashtable<String,shape> shapemap
            = new Hashtable<>();
    public static void loadCache(){
        rectangle shape1 = new rectangle();
        shape1.setId("1");
        shapemap.put(shape1.getId(),shape1);

        circle shape2 = new circle();
        shape2.setId("2");
        shapemap.put(shape2.getId(),shape2);

        square shape3 = new square();
        shape3.setId("3");
        shapemap.put(shape3.getId(),shape3);
    }
    public static shape getShape(String shapeId){
        shape tempshape = shapemap.get(shapeId);
        return (shape)(tempshape.clone());
    }
}
