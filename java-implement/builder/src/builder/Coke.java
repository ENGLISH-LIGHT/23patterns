package builder;

public class Coke extends ColdDrink {
    @Override
    public float price() {
        return 2.4f;
    }

    @Override
    public String name() {
        return "Coke";
    }
}
