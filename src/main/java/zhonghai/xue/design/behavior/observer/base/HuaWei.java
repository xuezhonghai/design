package zhonghai.xue.design.behavior.observer.base;

public class HuaWei implements Mobile {
    @Override
    public void receive(News news) {
        System.out.println("这个消息真有趣");
    }
}
