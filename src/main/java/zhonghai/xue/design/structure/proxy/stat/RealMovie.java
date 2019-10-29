package zhonghai.xue.design.structure.proxy.stat;

public class RealMovie implements Movice {
    @Override
    public void play() {
        System.out.println("您正在观看电影 《肖申克的救赎》");
    }
}
