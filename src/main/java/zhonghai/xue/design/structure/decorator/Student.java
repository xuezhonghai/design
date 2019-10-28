package zhonghai.xue.design.structure.decorator;

public class Student implements People {
    @Override
    public void wear() {
        System.out.println("今天该穿什么呢?");
    }
}
