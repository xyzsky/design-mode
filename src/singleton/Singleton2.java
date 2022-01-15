package singleton;

/**
 * @Author Xyz
 * @Date 2022/1/15
 */

// 懒汉式： 需要的时候在创建唯一单例
public class Singleton2 {

    private static Singleton2 instance;

    private Singleton2() {

    }

    // 线程不安全，可能创建多个“单例”
    public static Singleton2 getInstance() {
        if (instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }

    // 线程安全, 但是锁重量级
//    public static synchronized Singleton2 getInstance() {
//        if (instance == null) {
//            instance = new Singleton2();
//        }
//        return instance;
//    }
}
