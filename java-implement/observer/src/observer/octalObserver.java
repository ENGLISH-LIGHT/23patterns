package observer;

public class octalObserver extends observer {
    public octalObserver(subject sub){
        this.sub = sub;
        this.sub.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Octal String: "
        + Integer.toOctalString(this.sub.getState()));
    }
}
