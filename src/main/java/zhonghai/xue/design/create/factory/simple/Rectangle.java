package zhonghai.xue.design.create.factory.simple;

public class Rectangle implements Shape {

    public Rectangle() {
        System.out.println("Rectangle");
    }

    @Override
    public void draw() {
        System.out.println("draw Rectangle");
    }
}
