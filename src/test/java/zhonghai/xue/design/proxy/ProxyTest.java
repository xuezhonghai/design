package zhonghai.xue.design.proxy;

import org.junit.jupiter.api.Test;
import zhonghai.xue.design.structure.proxy.dynamic.*;
import zhonghai.xue.design.structure.proxy.stat.Cinema;
import zhonghai.xue.design.structure.proxy.stat.RealMovie;

import java.lang.reflect.Proxy;

public class ProxyTest {

    @Test
    public void testStatic(){
        Cinema cinema = new Cinema(new RealMovie());
        cinema.play();
    }

    @Test
    public void testDynamic(){
        MaoTai maoTai = new MaoTai();
        MallA mallA = new MallA(maoTai);
        Cola cola = new Cola();
        MallA mallA1 = new MallA(cola);

        SellWine dynamicProxy = (SellWine) Proxy.newProxyInstance(MaoTai.class.getClassLoader(),
                MaoTai.class.getInterfaces(), mallA);

        dynamicProxy.sell();

        SellCola dynamicProxy1 = (SellCola)Proxy.newProxyInstance(Cola.class.getClassLoader(), Cola.class.getInterfaces(), mallA1);

        dynamicProxy1.sell();
    }

}
