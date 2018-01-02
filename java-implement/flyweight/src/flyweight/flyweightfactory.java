package flyweight;

import java.util.HashMap;

public class flyweightfactory {
//    final  == const 一旦初始化，不能改变
//    （某个颜色对应的circle对象的内部代码所在空间不变）
//    外部代码可以通过调用set方法改变（X、Y、Radius）
    private static final HashMap<String,shape> circlemap = new HashMap();

    public circle getCircle(String color){
        circle tmp = (circle)(circlemap.get(color));
        if (tmp == null){
            tmp = new circle(color);
            circlemap.put(color,tmp);
            System.out.println("creating a new " + color + "'s circle");
        }
        return tmp;
    }
}
