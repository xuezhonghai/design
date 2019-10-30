package zhonghai.xue.design.behavior.state;

public class OpeningState extends BaseState {
    @Override
    public void run() {
        super.mContext.setBaseState(Context.FAULT_STATE);
    }

    @Override
    public void stop() {

    }

    @Override
    public void open() {
        System.out.println("电梯开门-----------");
    }

    @Override
    public void close() {
        super.mContext.setBaseState(Context.CLOSING_STATE);
        System.out.println("电梯关门-----------");
    }
}
