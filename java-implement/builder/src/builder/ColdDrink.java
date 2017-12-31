package builder;

public abstract class ColdDrink implements item{
    @Override
    public Packing packing() {
        return new bottle();
    }

    @Override
    public abstract float price();
}
