package zhonghai.xue.design.structure.proxy.dynamic;

public class MaoTai implements SellWine, Brand {
    @Override
    public void sell() {
        System.out.println("我卖得是茅台酒。");
    }

    @Override
    public String name() {
        return "茅台";
    }
}
