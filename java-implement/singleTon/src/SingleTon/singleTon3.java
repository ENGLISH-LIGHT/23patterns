package SingleTon;

//饥饿模式 -- 加载类时唯一创建一次，提供的外部接口直接使用

public class singleTon3 {
    private singleTon3(){
        System.out.println("init");
    }
    private static singleTon3 single = new singleTon3();

    public static singleTon3 getInstance(){
        return single;
    }
}
