package prototype;

public class rectangle extends shape {
    public rectangle(){
        type = "Rectangle";
    }
    @Override
    public void draw() {
        System.out.println("Draw rectangle");
    }
}
