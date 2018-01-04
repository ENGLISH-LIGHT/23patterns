package visitor;

public class elementB implements element {
    private String name;
    public elementB(String name){
        this.name = name;
    }

    @Override
    public void acceptVisit(visitor v) {
        v.visitElementB(this);
    }

    @Override
    public String getName() {
        return name;
    }
}
