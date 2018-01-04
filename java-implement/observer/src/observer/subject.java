package observer;

import java.util.ArrayList;
import java.util.List;

public class subject {
    private List<observer> observers = new ArrayList<observer>();
    private int state;
    public int getState(){
        return state;
    }
    public void setState(int state){
        this.state = state;
        notifyAllObservers();
    }
    public void attach(observer o){
        observers.add(o);
    }
    public void notifyAllObservers(){
        for (observer o : observers){
            o.update();
        }
    }
}
