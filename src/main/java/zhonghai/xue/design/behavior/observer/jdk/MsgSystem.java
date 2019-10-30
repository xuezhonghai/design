package zhonghai.xue.design.behavior.observer.jdk;


import zhonghai.xue.design.behavior.observer.base.News;

import java.util.Observable;

public class MsgSystem extends Observable {

    private News news;

    public MsgSystem(News news) {
        this.news = news;
    }

    public News getNews() {
        return news;
    }

    public void sendMsg(){
        setChanged();
        notifyObservers();
    }

}
