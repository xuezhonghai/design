package zhonghai.xue.design.create.factory.method;

import zhonghai.xue.design.create.factory.simple.Shape;

/**
 * 工厂方法模式是简单工厂的仅一步深化， 在工厂方法模式中，我们不再提供一个统一的工厂类来创建所有的对象，
 * 而是针对不同的对象提供不同的工厂。也就是说 每个对象都有一个与之对应的工厂
 *
 *工厂方法模式角色分配：
 1抽象工厂(Abstract Factory)角色：是工厂方法模式的核心，与应用程序无关。任何在模式中创建的对象的工厂类必须实现这个接口。
 2具体工厂(Concrete Factory)角色 ：这是实现抽象工厂接口的具体工厂类，包含与应用程序密切相关的逻辑，并且受到应用程序调用以创建某一种产品对象。
 3抽象产品(AbstractProduct)角色 ：工厂方法模式所创建的对象的超类型，也就是产品对象的共同父类或共同拥有的接口。
 4具体产品(Concrete Product)角色 ：这个角色实现了抽象产品角色所定义的接口。某具体产品有专门的具体工厂创建，它们之间往往一一对应
 */
public interface Factory {
    Shape getShape();
}
