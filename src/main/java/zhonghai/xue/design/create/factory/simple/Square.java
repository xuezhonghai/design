package zhonghai.xue.design.create.factory.simple;

public class Square implements Shape {

    public Square() {
        System.out.println("Square");
    }

    @Override
    public void draw() {
        System.out.println("draw Square");
    }
}
