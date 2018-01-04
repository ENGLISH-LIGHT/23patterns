package template;

public abstract class game {
    public abstract void initgame();
    public abstract void start();
    public abstract void end();
    public void play(){
        initgame();
        start();
        end();
    };
}
