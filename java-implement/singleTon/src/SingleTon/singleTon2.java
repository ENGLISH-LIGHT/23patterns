package SingleTon;

//懒汉模式2 -- 线程安全
public class singleTon2 {
    private static singleTon2 single;
    private singleTon2(){
        System.out.println("init");
    }
    public static singleTon2 getInstance(){
        if(single == null){
            //加个互斥锁
            System.out.println("step1");
            synchronized (singleTon2.class){
                System.out.println("step2");
                if(single == null){
                    System.out.println("step3");  // 参见下面注解
                    single = new singleTon2();
                }
            }
        }
        return single;
    }
}
//        假设A、B两个同时调用了getInstance方法，
//        此时A、B同时进入了step2，接下来A抢占先机进入step3，
//        由于做了同步锁，所以B不能再次进入step3，只能乖乖呆在原地。
//        当A已经成功实例化god后跳出了synchronized，而此时B会再次进入step3，
//        也就会重复创建god实例，不能实现单例模式的事实便不攻自破。
