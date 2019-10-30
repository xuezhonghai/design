package zhonghai.xue.design.behavior.observer.jdk;

import zhonghai.xue.design.behavior.observer.base.News;

import java.util.Observable;
import java.util.Observer;

public class Xue implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        MsgSystem msgSystem = (MsgSystem) o;
        News news = msgSystem.getNews();
        System.out.println(news);
        System.out.println("无聊");
    }
}
