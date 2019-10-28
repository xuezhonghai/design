package zhonghai.xue.design.structure.bridge;

public class SmallPen extends Pen {
    @Override
    public void draw(String name) {
        String penType="小号毛笔绘制";
        //调用桥接的 method
        this.color.bepaint(penType,name);
    }
}
