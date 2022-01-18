package factory;

import org.junit.jupiter.api.Test;

/**
 * @Author Xyz
 * @Date 2022/1/18
 */
public class Client {
    @Test
    public void test() {
        ComputerFactory macComputerFactory = new MacComputerFactory();
        // mac 具体工厂，但生产的电脑类实际并不知道是什么。封装；
        ComputerFactory miComputerFactory = new MiComputerFactory();
        macComputerFactory.makeComputer().setCpu();
        miComputerFactory.makeComputer().setCpu();
    }
}
