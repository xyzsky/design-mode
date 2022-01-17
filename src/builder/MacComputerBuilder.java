package builder;

/**
 * @Author Xyz
 * @Date 2022/1/17
 */

/**
 * concrete builder
 */
public class MacComputerBuilder implements ComputerBuilder{

    private Computer computer;

    public MacComputerBuilder(String cpu, String ram) {
        computer = new Computer(cpu, ram);
    }

    @Override
    public void setUsbCount() {
        computer.setUsbCount(2);
    }

    @Override
    public void setKeyboard() {
        computer.setKeyboard("apple keyboard");
    }

    @Override
    public void setDisplay() {
        computer.setDisplay("apple display");
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}
