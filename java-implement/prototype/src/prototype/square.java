package prototype;

public class square extends shape {
    @Override
    public void draw() {
        System.out.println("Draw square");
    }
    public square(){
        type = "Square";
    }
}
