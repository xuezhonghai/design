package zhonghai.xue.design.structure.flyweight;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.ConcurrentHashMap;

public class FlyWeightFactory {

    private static final Logger LOG = LoggerFactory.getLogger(FlyWeightFactory.class);

    private static ConcurrentHashMap<String, FlyWeight> allFlyWeight = new ConcurrentHashMap<String, FlyWeight>();

    public static FlyWeight getFlyWeight(String name) {
        if (allFlyWeight.get(name) == null) {
            synchronized (allFlyWeight) {
                if (allFlyWeight.get(name) == null) {
                    LOG.info("Instance of name = {} does not exist, creating it", name);
                    FlyWeight flyWeight = new ConcreteFlyWeight(name);
                    LOG.info("Instance of name = {} created", name);
                    allFlyWeight.put(name, flyWeight);
                }
            }
        }
        return allFlyWeight.get(name);
    }
}
