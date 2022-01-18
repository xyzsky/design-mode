package factory;

/**
 * @Author Xyz
 * @Date 2022/1/18
 */
public class MiComputerFactory implements ComputerFactory{
    @Override
    public Computer makeComputer() {
        return new MiComputer();
    }
}
