package zhonghai.xue.design.structure.adapter;

import lombok.extern.java.Log;

@Log
public class Mobile {

    // 这里传入的是 v5接口,实现了这个接口的类也可以传入
    public void inputPower(V5Power v5Power) {
        int provideV5Power = v5Power.provideV5Power();
        log.info("手机(客户端): 我需要的是5V电压充电,现在是" + provideV5Power + "V");
    }
}
