package abstract_factory;

import org.junit.jupiter.api.Test;

/**
 * @Author Xyz
 * @Date 2022/1/18
 */
public class Client {

    @Test
    public void test1() {
        AbstractFactory factory = new ChinaFactory();
        factory.productBed();
        factory.productChair();
        factory.productTable();
        AbstractFactory usaFactory = new USAFactory();
        usaFactory.productTable();
        usaFactory.productChair();
        usaFactory.productBed();
    }
}
