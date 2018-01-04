package template;

public class planesBattle extends game {
    public void initgame() {
        System.out.println(this.getClass().toString() + " : Init");
    }

    @Override
    public void start() {
        System.out.println(this.getClass().toString() + " : Start");
    }

    @Override
    public void end() {
        System.out.println(this.getClass().toString() + " : End");
    }
}
