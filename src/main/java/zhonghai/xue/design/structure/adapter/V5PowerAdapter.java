package zhonghai.xue.design.structure.adapter;

import lombok.extern.java.Log;

@Log
public class V5PowerAdapter implements V5Power {


    private int power;


    public V5PowerAdapter(V220Power power){
        this.power = power.provideV220Power();
    }


    @Override
    public int provideV5Power() {
        int i = power - 5;
        log.info("电源转换");
        return power - i;
    }
}
