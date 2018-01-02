package prototype;

public class circle extends shape {
    @Override
    public void draw() {
        System.out.println("Draw circle");
    }
    public circle(){
        type = "Circle";
    }
}
