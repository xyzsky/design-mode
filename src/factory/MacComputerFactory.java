package factory;

/**
 * @Author Xyz
 * @Date 2022/1/18
 */
public class MacComputerFactory implements ComputerFactory{
    @Override
    public Computer makeComputer() {
        return new MacComputer();
    }
}
