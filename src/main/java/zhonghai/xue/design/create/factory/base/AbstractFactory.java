package zhonghai.xue.design.create.factory.base;

/**
 * 抽象工厂的工厂和工厂方法中的工厂有什么区别呢？
 * 抽象工厂是生产一整套有产品的（至少要生产两个产品)，
 * 这些产品必须相互是有关系或有依赖的，而工厂方法中的工厂是生产单一产品的工厂。
 *
 *  抽象工厂方法模式角色分配：
 1抽象工厂（AbstractFactory）角色 ：是工厂方法模式的核心，与应用程序无关。任何在模式中创建的对象的工厂类必须实现这个接口。
 2具体工厂类（ConcreteFactory）角色 ：这是实现抽象工厂接口的具体工厂类，包含与应用程序密切相关的逻辑，并且受到应用程序调用以创建某一种产品对象。
 3抽象产品（Abstract Product）角色 ：工厂方法模式所创建的对象的超类型，也就是产品对象的共同父类或共同拥有的接口。
 4具体产品（Concrete Product）角色 ：抽象工厂模式所创建的任何产品对象都是某一个具体产品类的实例。在抽象工厂中创建的产品属于同一产品族，这不同于工厂模式中的工厂只创建单一产品，我后面也会详解介绍到。
 *
 */
public abstract class AbstractFactory {

    public abstract Gun produceGun();

    public abstract Bullet produceBullet();

}
