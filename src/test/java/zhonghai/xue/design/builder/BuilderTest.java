package zhonghai.xue.design.builder;

import org.junit.jupiter.api.Test;
import zhonghai.xue.design.create.builder.KFCWaiter;
import zhonghai.xue.design.create.builder.Meal;
import zhonghai.xue.design.create.builder.PlanA;
import zhonghai.xue.design.create.builder.PlanB;

public class BuilderTest {

    @Test
    public void testPlanA(){
        KFCWaiter kfcWaiter = new KFCWaiter();
        PlanA planA = new PlanA();
        kfcWaiter.setMealBuilder(planA);
        Meal meal = kfcWaiter.build();
        System.out.println(meal.toString());
    }

    @Test
    public void testPlanB(){
        KFCWaiter kfcWaiter = new KFCWaiter();
        PlanB planB = new PlanB();
        kfcWaiter.setMealBuilder(planB);
        Meal meal = kfcWaiter.build();
        System.out.println(meal.toString());
    }




}
