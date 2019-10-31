package zhonghai.xue.design.visitor;

import org.junit.jupiter.api.Test;
import zhonghai.xue.design.behavior.visitor.Computer;
import zhonghai.xue.design.behavior.visitor.ComputerPartDisplayVisitor;

public class VisitorTest {

    @Test
    public void test1(){
        Computer computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
