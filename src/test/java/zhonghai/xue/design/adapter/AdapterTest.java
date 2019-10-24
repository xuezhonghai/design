package zhonghai.xue.design.adapter;

import org.junit.jupiter.api.Test;
import zhonghai.xue.design.structure.adapter.Mobile;
import zhonghai.xue.design.structure.adapter.V220Power;
import zhonghai.xue.design.structure.adapter.V5PowerAdapter;

public class AdapterTest {

    @Test
    public void test1(){
        Mobile mobile = new Mobile();
        V5PowerAdapter powerAdapter = new V5PowerAdapter(new V220Power());
        mobile.inputPower(powerAdapter);
    }
}
