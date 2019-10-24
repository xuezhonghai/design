package zhonghai.xue.design.create.factory.simple;

public class Circle implements Shape {

    public Circle() {
        System.out.println("Circle");
    }

    @Override
    public void draw() {
        System.out.println("draw Circle");
    }
}
