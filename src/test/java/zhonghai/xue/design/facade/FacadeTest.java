package zhonghai.xue.design.facade;

import org.junit.jupiter.api.Test;
import zhonghai.xue.design.structure.facade.Computer;

public class FacadeTest {

    @Test
    public void test1() throws InterruptedException {
        Computer computer = new Computer();
        computer.start();
        System.out.println("工作中。。。");
        Thread.sleep(3000);
        computer.shutdown();
    }
}
