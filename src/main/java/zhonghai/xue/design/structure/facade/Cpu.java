package zhonghai.xue.design.structure.facade;

public class Cpu implements Button {


    @Override
    public void start() {
        System.out.println("cpu is start");
    }

    @Override
    public void shutdown() {
        System.out.println("cpu is shutdown");
    }
}
