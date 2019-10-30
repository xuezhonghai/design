package zhonghai.xue.design.behavior.strategy;

public class Context {

    private Strategy strategy;

    public void setStrategy(Strategy strategy){
        this.strategy = strategy;
    }

    public int getResult(int a , int b){
        return  strategy.calculate(a, b);
    }
}
