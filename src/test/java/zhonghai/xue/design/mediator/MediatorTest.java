package zhonghai.xue.design.mediator;

import org.junit.jupiter.api.Test;
import zhonghai.xue.design.behavior.mediator.ChatUser;

public class MediatorTest {

    @Test
    public void test1(){
        ChatUser ming = new ChatUser("小明");
        ChatUser hong = new ChatUser("小红");
        ming.sendMsg("hello, 小红");
        hong.sendMsg("get out, 臭屌丝");
    }
}
