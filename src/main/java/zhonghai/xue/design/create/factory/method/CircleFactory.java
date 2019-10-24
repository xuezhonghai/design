package zhonghai.xue.design.create.factory.method;

import zhonghai.xue.design.create.factory.simple.Circle;
import zhonghai.xue.design.create.factory.simple.Shape;

public class CircleFactory implements Factory {

    @Override
    public Shape getShape() {
        return new Circle();
    }
}
