package zhonghai.xue.design.decorator;

import org.junit.jupiter.api.Test;
import zhonghai.xue.design.structure.decorator.DecoratorPants;
import zhonghai.xue.design.structure.decorator.DecoratorShirt;
import zhonghai.xue.design.structure.decorator.Student;

public class DecoratorTest {
    
    @Test
    public void test1(){
        DecoratorPants student = new DecoratorPants(new DecoratorShirt(new Student()));
        student.wear();
    }
}
