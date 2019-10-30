package zhonghai.xue.design.behavior.observer.base;

public class NewSubject implements Subject {

    private News news;

    public NewSubject(News news) {
        this.news = news;
    }

    @Override
    public void notifyMsg() {
        System.out.println(news);
        for (Mobile mobile : mobiles) {
            mobile.receive(news);
        }
    }
}
