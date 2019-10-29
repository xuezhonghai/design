package zhonghai.xue.design.structure.facade;

public class Computer implements Button {

    private Cpu cpu;

    private Disk disk;

    private Memory memory;

    public Computer() {
        this.cpu = new Cpu();
        this.disk = new Disk();
        this.memory = new Memory();
    }


    @Override
    public void start() {
        System.out.println("开启电脑");
        cpu.start();
        memory.start();
        disk.start();
    }

    @Override
    public void shutdown() {
        System.out.println("关闭电脑");
        cpu.shutdown();
        memory.shutdown();
        disk.shutdown();
    }
}
