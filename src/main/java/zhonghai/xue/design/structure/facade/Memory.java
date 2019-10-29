package zhonghai.xue.design.structure.facade;

public class Memory implements Button {
    @Override
    public void start() {
        System.out.println("Memory is start");
    }

    @Override
    public void shutdown() {
        System.out.println("Memory is shutdown");
    }
}
