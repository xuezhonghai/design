package zhonghai.xue.design.behavior.observer.base;

import java.util.ArrayList;
import java.util.List;

public interface Subject {

    List<Mobile> mobiles = new ArrayList<>();

    default void add(Mobile mobile) {
        mobiles.add(mobile);
    }

    default void remove(Mobile mobile) {
        mobiles.remove(mobile);
    }

    void notifyMsg();
}
