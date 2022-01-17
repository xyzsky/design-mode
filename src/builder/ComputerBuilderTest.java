package builder;

import org.junit.jupiter.api.Test;

/**
 * @Author Xyz
 * @Date 2022/1/17
 */
public class ComputerBuilderTest {

    @Test
    public void test1() {
        ComputerDirector director = new ComputerDirector();
        ComputerBuilder macComputerBuilder = new MacComputerBuilder("apple cpu", "apple ram");
        ComputerBuilder lenovoComputerBuilder = new LenovoComputerBuilder("lenovo cpu", "lenovo ram");
        director.construct(macComputerBuilder);
        director.construct(lenovoComputerBuilder);
        Computer mac = macComputerBuilder.getComputer();
        Computer lenovo = lenovoComputerBuilder.getComputer();
        System.out.println("mac: " + mac);
        System.out.println("lenovo " + lenovo);
    }
}
