package zhonghai.xue.design.state;

import org.junit.jupiter.api.Test;
import zhonghai.xue.design.behavior.state.ClosingState;
import zhonghai.xue.design.behavior.state.Context;
import zhonghai.xue.design.behavior.state.RunningState;

public class StateTest {

    @Test
    public void test1(){
        Context context = new Context();
        context.setBaseState(new ClosingState());
        context.run().open().close();

        System.out.println("==========================");

        Context context1 = new Context();
        context1.setBaseState(new RunningState());
        context1.stop().open().run().open();


    }
}
