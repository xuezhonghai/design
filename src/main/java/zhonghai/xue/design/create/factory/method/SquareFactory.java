package zhonghai.xue.design.create.factory.method;

import zhonghai.xue.design.create.factory.simple.Shape;
import zhonghai.xue.design.create.factory.simple.Square;

public class SquareFactory implements Factory {
    @Override
    public Shape getShape() {
        return new Square();
    }
}
