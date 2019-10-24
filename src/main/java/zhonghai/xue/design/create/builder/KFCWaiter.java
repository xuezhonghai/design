package zhonghai.xue.design.create.builder;

public class KFCWaiter {

    private MealBuilder mealBuilder;

    public void setMealBuilder(MealBuilder builder){
        this.mealBuilder = builder;
    }

    public Meal build(){
        mealBuilder.buildFood();
        mealBuilder.buildDrink();
        return mealBuilder.getMeal();
    }


}
