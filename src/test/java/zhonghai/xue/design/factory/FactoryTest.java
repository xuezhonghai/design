package zhonghai.xue.design.factory;

import org.junit.jupiter.api.Test;
import zhonghai.xue.design.create.factory.base.AkFactory;
import zhonghai.xue.design.create.factory.base.Bullet;
import zhonghai.xue.design.create.factory.base.Gun;
import zhonghai.xue.design.create.factory.base.M4A1Factory;
import zhonghai.xue.design.create.factory.method.CircleFactory;
import zhonghai.xue.design.create.factory.simple.*;


public class FactoryTest {

    @Test
    public void simpleFactoryTest(){
        // 获取 Circle 的对象，并调用它的 draw 方法
        Shape circle = ShapeFactory.getShape("CIRCLE");
        circle.draw();

        // 获取 Rectangle 的对象，并调用它的 draw 方法
        Shape rectangle = ShapeFactory.getShape("RECTANGLE");
        rectangle.draw();

        // 获取 Square 的对象，并调用它的 draw 方法
        Shape square = ShapeFactory.getShape("SQUARE");
        square.draw();
    }

    @Test
    public void simpleFactoryTest2(){
        // 获取 Circle 的对象，并调用它的 draw 方法
        Shape circle = (Circle)ShapeFactory2.getShape(Circle.class);
        circle.draw();

        // 获取 Rectangle 的对象，并调用它的 draw 方法
        Shape rectangle = (Rectangle)ShapeFactory2.getShape(Rectangle.class);
        rectangle.draw();

        // 获取 Square 的对象，并调用它的 draw 方法
        Shape square = (Square)ShapeFactory2.getShape(Square.class);
        square.draw();
    }

    /**
     * 工厂方法模式是简单工厂的仅一步深化，
     * 在工厂方法模式中，我们不再提供一个统一的工厂类来创建所有的对象，
     * 而是针对不同的对象提供不同的工厂。也就是说 每个对象都有一个与之对应的工厂
     */
    @Test
    public void factoryMethodTest(){
        CircleFactory circleFactory = new CircleFactory();
        Shape shape = circleFactory.getShape();
        shape.draw();
    }

    @Test
    public void abstractFactoryMethodTest(){
        //AkFactory gunFactory = new AkFactory();
        M4A1Factory gunFactory = new M4A1Factory();
        Bullet bullet = gunFactory.produceBullet();
        Gun gun = gunFactory.produceGun();
        bullet.load();
        gun.shooting();
    }
}
