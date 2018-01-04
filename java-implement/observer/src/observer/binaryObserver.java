package observer;

public class binaryObserver extends observer{
    public binaryObserver(subject sub){
        this.sub = sub;
        this.sub.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Binary String: "
                + Integer.toBinaryString( sub.getState()));
    }
}
