package zhonghai.xue.design.structure.proxy.dynamic;

public class Cola implements Brand, SellCola {
    @Override
    public String name() {
        return "可乐";
    }

    @Override
    public void sell() {
        System.out.println("我卖的是可口可乐");
    }
}
