package SingleTon;

import java.security.Signature;

//懒汉模式  （需要的时候才唯一实例化）
public class SingleTon1 {
    private static SingleTon1 single;
    private SingleTon1(){
        //私有，不对外提供构造函数
        System.out.println("init");
    }
    //外部创建单例类对象的唯一方法
    public static SingleTon1 getInstance(){
        System.out.println("step1");
        if(single == null){
            System.out.println("step2");
            single = new SingleTon1();
        }
        return single;
    }
}
//缺点
// 1）在并发多线程环境下，可能就会出现多个God实例
// 2) 多线程情况下和单线程最终得到的结果可能会有差异：线程不安全
// 3) 即使构造方法已经私有化，但通过java反射机制，仍然可以实例化多个对象