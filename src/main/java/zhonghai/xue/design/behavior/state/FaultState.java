package zhonghai.xue.design.behavior.state;

public class FaultState extends BaseState {
    @Override
    public void run() {
        System.out.println("电梯发生故障，不能正常工作");
    }

    @Override
    public void stop() {
        System.out.println("电梯发生故障，不能正常工作");
    }

    @Override
    public void open() {
        System.out.println("电梯发生故障，不能正常工作");
    }

    @Override
    public void close() {
        System.out.println("电梯发生故障，不能正常工作");
    }
}
