package zhonghai.xue.design.structure.flyweight;

import lombok.extern.java.Log;

@Log
public class ConcreteFlyWeight implements FlyWeight {

    private String name;

    public ConcreteFlyWeight(String name) {
        this.name = name;
    }

    @Override
    public void action(String externalState) {
        log.info("name = " + this.name+ ", outerState = " + externalState);
    }

}
