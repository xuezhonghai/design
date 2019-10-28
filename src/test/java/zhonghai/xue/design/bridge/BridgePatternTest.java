package zhonghai.xue.design.bridge;

import org.junit.jupiter.api.Test;
import zhonghai.xue.design.structure.bridge.Color;
import zhonghai.xue.design.structure.bridge.Pen;
import zhonghai.xue.design.structure.bridge.XMLUtilPen;
import zhonghai.xue.design.structure.composite.ConcreteCompany;
import zhonghai.xue.design.structure.composite.FinanceDepartment;
import zhonghai.xue.design.structure.composite.HRDepartment;

public class BridgePatternTest {

    @Test
    public void  test1(){
        Color color;
        Pen pen;

        color=(Color) XMLUtilPen.getBean("color");
        pen=(Pen)XMLUtilPen.getBean("pen");

        pen.setColor(color);
        pen.draw("鲜花");

    }



}
