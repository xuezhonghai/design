package zhonghai.xue.design.structure.facade;

public class Disk implements Button {
    @Override
    public void start() {
        System.out.println("disk is start");
    }

    @Override
    public void shutdown() {
        System.out.println("disk is shutdown");
    }
}
