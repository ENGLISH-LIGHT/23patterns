package builder;

public class ChickenBurger extends Burger {
    @Override
    public float price() {
        return 58.0f;
    }

    @Override
    public String name() {
        return "ChickenBurger";
    }
}
