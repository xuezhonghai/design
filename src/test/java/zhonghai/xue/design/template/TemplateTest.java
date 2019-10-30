package zhonghai.xue.design.template;

import org.junit.jupiter.api.Test;
import zhonghai.xue.design.behavior.template.Cricket;
import zhonghai.xue.design.behavior.template.Football;

public class TemplateTest {

    @Test
    public void test1(){
        Cricket cricket = new Cricket();
        cricket.play();

        Football football = new Football();
        football.play();
    }
}
