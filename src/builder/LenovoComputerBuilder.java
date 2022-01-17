package builder;

/**
 * @Author Xyz
 * @Date 2022/1/17
 */
public class LenovoComputerBuilder implements ComputerBuilder{

    private Computer computer;

    public LenovoComputerBuilder(String cpu, String ram) {
        computer = new Computer(cpu, ram);
    }

    @Override
    public void setUsbCount() {
        computer.setUsbCount(4);
    }

    @Override
    public void setKeyboard() {
        computer.setKeyboard("lenovo keyboard");
    }

    @Override
    public void setDisplay() {
        computer.setDisplay("lenovo display");
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}
