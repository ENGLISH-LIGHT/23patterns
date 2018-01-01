package SingleTon;

//import java.lang.Thread;
public class Main {
    public static void main(String[] args)
    {
//        懒汉加载
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                SingleTon1.getInstance();
//                SingleTon1.getInstance();
//                SingleTon1.getInstance();
//            }
//        }).start();
//         new Thread(new Runnable() {
//             @Override
//             public void run() {
//                 singleTon2.getInstance();
//                 singleTon2.getInstance();
//                 singleTon2.getInstance();
//                 singleTon2.getInstance();
//             }
//         }).start();
//        饿汉加载
            singleTon3.getInstance();
    }
}


