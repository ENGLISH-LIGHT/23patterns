package visitor;

import java.util.ArrayList;
import java.util.List;

public class objectStructure {
    private List<element> list = new ArrayList<element>();
    private List<elementA> listA = new ArrayList<elementA>();
    private List<elementB> listB = new ArrayList<elementB>();
    public void attach(element e){
        list.add(e);
    }
    public void attachA(elementA a){
        list.add(a);
        listA.add(a);
    }
    public void attachB(elementB b){
        list.add(b);
        listB.add(b);
    }
    public void accept(visitor v){
        for (element e : list){
            e.acceptVisit(v);
        }
    }
    public void acceptA(visitor va){
        for (element e : listA){
            e.acceptVisit(va);
        }
    }
    public void acceptB(visitor vb){
        for (element e : listB){
            e.acceptVisit(vb);
        }
    }
}
