package decorator;

public class circle implements shape {
    @Override
    public void draw() {
        System.out.println("Draw Circle");
    }
}