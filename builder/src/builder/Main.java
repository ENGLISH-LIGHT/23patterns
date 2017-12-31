package builder;

public class Main {

    public static void main(String[] args)
    {
        //套餐一
        MealBuilder type1 = new MealBuilder();
        Meal meal1 = type1.prepareVegSurger();
        System.out.println("套餐一： ");
        meal1.showItems();
        System.out.println("Cost: " + meal1.getCost());

        //套餐二
        MealBuilder type2 = new MealBuilder();
        Meal meal2 = type2.prepareNoVegSurger();
        System.out.println("套餐二： ");
        meal2.showItems();
        System.out.println("Cost: " + meal2.getCost());
    }
}
