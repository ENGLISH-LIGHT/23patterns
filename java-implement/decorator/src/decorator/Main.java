package decorator;

public class Main {

    public static void main(String[] args) {
        circle shape1 = new circle();
        rectangle shape2 = new rectangle();
//        装饰后的形状
        redShapeDecorator shape3 = new redShapeDecorator(new circle());
        greenShapeDecorator shape4 = new greenShapeDecorator(new circle());
        redShapeDecorator shape5 = new redShapeDecorator(new rectangle());
        greenShapeDecorator shape6 = new greenShapeDecorator(new rectangle());
        shape1.draw();
        shape2.draw();
        shape3.draw();
        shape4.draw();
        shape5.draw();
        shape6.draw();
    }
}
