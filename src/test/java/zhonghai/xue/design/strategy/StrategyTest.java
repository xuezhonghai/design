package zhonghai.xue.design.strategy;

import org.junit.jupiter.api.Test;
import zhonghai.xue.design.behavior.strategy.Addition;
import zhonghai.xue.design.behavior.strategy.Context;
import zhonghai.xue.design.behavior.strategy.Subtraction;

public class StrategyTest {

    @Test
    public void test1(){
        Context calculator = new Context();
        calculator.setStrategy(new Addition());
        int result = calculator.getResult(10, 15);
        System.out.println("10 + 15 = " + result);
        calculator.setStrategy(new Subtraction());
        int result1 = calculator.getResult(20, 15);
        System.out.println("20 - 15 = " + result1);
    }
}
