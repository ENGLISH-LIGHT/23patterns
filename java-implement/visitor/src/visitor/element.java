package visitor;

public interface element {
    public void acceptVisit(visitor v);
    public String getName();
}
