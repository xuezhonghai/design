package zhonghai.xue.design.create.single.lazy;

/**
 *懒汉式
 * @author xzh
 * @date  2019/10/24 0024
 * @email 13063689739@163.com
 */
public class Singleton {

    private volatile static Singleton singleton;

    private Singleton(){}

    public static Singleton getInstance(){
        if(singleton == null){
            //防止多线程
            synchronized (Singleton.class){
                //再次判断
                if(singleton == null){
                    singleton = new Singleton();
                }
            }
        }
        return  singleton;
    }


}
