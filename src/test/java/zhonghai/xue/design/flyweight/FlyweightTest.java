package zhonghai.xue.design.flyweight;

import org.junit.jupiter.api.Test;
import zhonghai.xue.design.structure.flyweight.FlyWeight;
import zhonghai.xue.design.structure.flyweight.FlyWeightFactory;

public class FlyweightTest {

    @Test
    public void test1(){
        FlyWeightFactory factory = new FlyWeightFactory();
        FlyWeight a = factory.getFlyWeight("a");
        FlyWeight b = factory.getFlyWeight("b");
        a.action("l'm  from usa");
        b.action("l'm  from japan");
    }
}
