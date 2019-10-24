package zhonghai.xue.design.create.builder;

public class PlanA extends MealBuilder {
    @Override
    public void buildFood() {
        meal.setFood("汉堡");
    }

    @Override
    public void buildDrink() {
        meal.setDrink("可乐");
    }
}
