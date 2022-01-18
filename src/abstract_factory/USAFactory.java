package abstract_factory;

/**
 * @Author Xyz
 * @Date 2022/1/18
 */
public class USAFactory implements AbstractFactory{
    @Override
    public Table productTable() {
        return new USATable();
    }

    @Override
    public Chair productChair() {
        return new USAChair();
    }

    @Override
    public Bed productBed() {
        return new USABed();
    }
}
