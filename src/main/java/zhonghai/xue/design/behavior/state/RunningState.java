package zhonghai.xue.design.behavior.state;

public class RunningState extends BaseState {
    @Override
    public void run() {
        System.out.println("电梯开始跑起来-----------");
    }

    @Override
    public void stop() {
        super.mContext.setBaseState(Context.STOPPING_STATE);
        System.out.println("电梯停止-----------");
    }

    @Override
    public void open() {
        super.mContext.setBaseState(Context.FAULT_STATE);
        System.out.println("电梯发生故障");
    }

    @Override
    public void close() {
        System.out.println("电梯关门-----------");
    }
}
