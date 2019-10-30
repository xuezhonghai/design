package zhonghai.xue.design.behavior.observer.base;

public class Apple implements Mobile {
    @Override
    public void receive(News news) {
        System.out.println("拒绝接受垃圾信息");
    }
}
