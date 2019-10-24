package zhonghai.xue.design.prototype;

import org.junit.jupiter.api.Test;
import zhonghai.xue.design.create.proto.Manager;
import zhonghai.xue.design.create.proto.MessageBox;
import zhonghai.xue.design.create.proto.Product;
import zhonghai.xue.design.create.proto.UnderlinePen;

public class ProtoTypeTest {

    @Test
    public void  test1(){
        Manager manager = new Manager();
        UnderlinePen underlinePen=new UnderlinePen('~');
        MessageBox mbox=new MessageBox('*');
        MessageBox sbox=new MessageBox('/');
        manager.register("Strong message", underlinePen);
        manager.register("Waring Box", mbox);
        manager.register("Slash Box", sbox);
        Product p1=manager.create("Strong message");
        p1.use("hello world");
        Product p2=manager.create("Waring Box");
        p2.use("hello world");
        Product p3=manager.create("Slash Box");
        p3.use("hello world");
    }
}
