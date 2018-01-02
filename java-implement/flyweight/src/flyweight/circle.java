package flyweight;

public class circle implements shape {
//    圆心坐标
    private int x = 0;
    private int y = 0;
//    圆半径
    private int radius = 0;
//    颜色——>作为唯一标识
    private String color = "";
    public circle(String color){
        this.color = color;
    }
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public void setRadius(int radius){
        this.radius = radius;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public int getRadius(){
        return radius;
    }
    public String getColor(){
        return color;
    }
    @Override
    public void draw() {
        System.out.println("Draw Circle : [ "
                + "location : (" + this.x + ", " + this.y +  "), "
                + "radius : " + this.radius + ", "
                + "color : " + this.color + " ]");
    }
}
