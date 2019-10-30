package zhonghai.xue.design.behavior.state;

public class StoppingState extends BaseState {
    @Override
    public void run() {
        super.mContext.setBaseState(Context.RUNNING_STATE);
        System.out.println("电梯开始跑起来-----------");
    }

    @Override
    public void stop() {
        super.mContext.setBaseState(Context.STOPPING_STATE);
        System.out.println("电梯停止-----------");
    }

    @Override
    public void open() {
        super.mContext.setBaseState(Context.OPENING_STATE);
        System.out.println("电梯开门-----------");
    }

    @Override
    public void close() {
        System.out.println("电梯关门-----------");
    }
}
