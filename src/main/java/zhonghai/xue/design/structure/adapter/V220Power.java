package zhonghai.xue.design.structure.adapter;

import lombok.extern.java.Log;

@Log
public class V220Power {

    public int provideV220Power(){
        log.info("家用电220V");
        return 220;
    }
}
