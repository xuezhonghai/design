package zhonghai.xue.design.behavior.state;

public class ClosingState extends BaseState {


    @Override
    public void run() {
        super.mContext.setBaseState(Context.RUNNING_STATE);
        System.out.println("电梯开始跑起来-----------");
    }

    @Override
    public void stop() {
        super.mContext.setBaseState(Context.STOPPING_STATE);
        System.out.println("电梯关门-----------");
    }

    @Override
    public void open() {
        super.mContext.setBaseState(Context.CLOSING_STATE);
        System.out.println("电梯开门-----------");
    }

    @Override
    public void close() {
        super.mContext.setBaseState(Context.STOPPING_STATE);
        System.out.println("电梯关门-----------");
    }
}
