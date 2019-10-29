package zhonghai.xue.design.command;

import org.junit.jupiter.api.Test;
import zhonghai.xue.design.behavior.command.Broker;
import zhonghai.xue.design.behavior.command.BuyStock;
import zhonghai.xue.design.behavior.command.SellStock;
import zhonghai.xue.design.behavior.command.Stock;

public class CommandTest {

    @Test
    public void test1(){
        Stock abcStock = new Stock();

        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
    }
}
