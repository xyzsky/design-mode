package abstract_factory;

/**
 * 定义抽象工厂接口，抽象工厂是创建一系列产品的工厂，
 * 比如苹果工厂生产 iPhone，ipad, mac; 小米工厂生产 xiaomi, redmi; 美的工厂生产 空调，电视，洗衣机。
 *
 * eg: 此处抽象工厂为家具工厂，生产桌子、椅子、床
 */
public interface AbstractFactory {
    Table productTable();
    Chair productChair();
    Bed productBed();
}
