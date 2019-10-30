package zhonghai.xue.design.iterator;

import org.junit.jupiter.api.Test;
import zhonghai.xue.design.behavior.iterator.Iterator;
import zhonghai.xue.design.behavior.iterator.NameRepository;

public class IteratorTest {

    @Test
    public void test1(){
        NameRepository nameRepository = new NameRepository();
        Iterator iterator = nameRepository.getIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
