package builder;

public class MealBuilder {
    public Meal prepareVegSurger(){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
//        meal.addItem(new ChickenBurger());
        return meal;
    }
    public Meal prepareNoVegSurger(){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
