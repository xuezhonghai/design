package zhonghai.xue.design.behavior.strategy;

public class Subtraction implements Strategy {
    @Override
    public int calculate(int a, int b) {
        return a - b;
    }
}
