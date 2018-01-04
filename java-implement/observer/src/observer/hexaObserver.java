package observer;

public class hexaObserver extends observer{
    public hexaObserver(subject sub){
        this.sub = sub;
        this.sub.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Hex String: "
                + Integer.toHexString(this.sub.getState()));
    }
}
