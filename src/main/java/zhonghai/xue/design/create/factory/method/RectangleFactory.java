package zhonghai.xue.design.create.factory.method;

import zhonghai.xue.design.create.factory.simple.Rectangle;
import zhonghai.xue.design.create.factory.simple.Shape;

public class RectangleFactory implements Factory {
    @Override
    public Shape getShape() {
        return new Rectangle();
    }
}
