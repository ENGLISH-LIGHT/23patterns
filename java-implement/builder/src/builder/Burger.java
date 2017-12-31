package builder;

public abstract class Burger implements item{
    @Override
    public Packing packing() {
        return new wrapper();
    }

    @Override
    public abstract  float price() ;
}
