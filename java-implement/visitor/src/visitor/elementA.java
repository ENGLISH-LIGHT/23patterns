package visitor;

public class elementA implements element{
    private String name;
    public elementA(String name){
        this.name = name;
    }

    @Override
    public void acceptVisit(visitor v) {
        v.visitElementA(this);
    }

    @Override
    public String getName() {
        return name;
    }
}
