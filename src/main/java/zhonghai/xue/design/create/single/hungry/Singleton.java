package zhonghai.xue.design.create.single.hungry;



/**
 * 饿汉式
 * @author xzh
 * @date  2019/10/24 0024
 * @email 13063689739@163.com
 */
public class Singleton {

    /**
     * 在静态初始化器中创建单例实例，这段代码保证了线程安全
     */
    private static Singleton singleton = new Singleton();

    private Singleton(){}

    public static Singleton getInstance(){
        return singleton;
    }

}
