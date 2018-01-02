package flyweight;

import java.util.Random;

public class Main {

    private static final String colors[]
            ={"red","green","blue","yellow","black"};
    public static void main(String[] args) {
        flyweightfactory circlefactory = new flyweightfactory();
        for (int i = 0; i < 20; i++){
            circle r = circlefactory.getCircle(getRandomColor());
            r.setX(getRandomX());
            r.setY(getRandomY());
            r.setRadius(getRandomRadius());
            r.draw();
        }
    }
//    产生随机的X、Y、Radius、Color
    private static int getRandomX(){
        return (int)(Math.random()*100);
    }
    private static int getRandomY(){
        return (int)(Math.random()*100);
    }
    private static String getRandomColor(){
        return colors[(int)(Math.random()*colors.length)];
    }
    private static int getRandomRadius(){
        return (int)(Math.random() * 50 + 50);
    }
}
