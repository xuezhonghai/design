package zhonghai.xue.design.observer;

import org.junit.jupiter.api.Test;
import zhonghai.xue.design.behavior.observer.base.Apple;
import zhonghai.xue.design.behavior.observer.base.HuaWei;
import zhonghai.xue.design.behavior.observer.base.NewSubject;
import zhonghai.xue.design.behavior.observer.base.News;
import zhonghai.xue.design.behavior.observer.jdk.Lin;
import zhonghai.xue.design.behavior.observer.jdk.MsgSystem;
import zhonghai.xue.design.behavior.observer.jdk.Xue;

public class ObserverTest {

    @Test
    public void test1(){
        News news = new News();
        news.setContent("今日在大街上，有人躲在草丛中袭击路人，还大喊“德玛西亚万岁”");
        news.setTitle("德玛西亚出现了");
        NewSubject subject = new NewSubject(news);
        subject.add(new Apple());
        subject.add(new HuaWei());
        subject.notifyMsg();
    }

    @Test
    public void test2(){
        News news = new News();
        news.setContent("今日在大街上，有人躲在草丛中袭击路人，还大喊“德玛西亚万岁”");
        news.setTitle("德玛西亚出现了");
        MsgSystem msgSystem = new MsgSystem(news);
        msgSystem.addObserver(new Xue());
        msgSystem.addObserver(new Lin());

        msgSystem.sendMsg();
    }
}
