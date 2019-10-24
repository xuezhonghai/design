package zhonghai.xue.design.create.builder;

public class PlanB extends MealBuilder {
    @Override
    public void buildFood() {
        meal.setFood("翅桶");
    }

    @Override
    public void buildDrink() {
        meal.setDrink("九珍果汁");
    }
}
