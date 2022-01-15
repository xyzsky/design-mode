package singleton;

/**
 * @Author Xyz
 * @Date 2022/1/15
 * @Desc 饿汉式
 */

// 饿汉式： 类在第一次初始化时就已经创建好唯一的单例
public class Singleton1 {
    private static Singleton1 instance = new Singleton1();

    private Singleton1() {

    }

    public static Singleton1 getInstance() {
        return instance;
    }
}
