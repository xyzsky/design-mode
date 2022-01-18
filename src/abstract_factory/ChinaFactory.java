package abstract_factory;

/**
 * @Author Xyz
 * @Date 2022/1/18
 */
public class ChinaFactory implements AbstractFactory{
    @Override
    public Table productTable() {
        return new ChinaTable();
    }

    @Override
    public Chair productChair() {
        return new ChinaChair();
    }

    @Override
    public Bed productBed() {
        return new ChinaBed();
    }
}
