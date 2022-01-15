package singleton;

/**
 * @Author Xyz
 * @Date 2022/1/15
 */

// 双重锁实现：
public class Singleton3 {

    // volatile: 禁止指令重排
    private static volatile Singleton3 instance;

    private Singleton3() {

    }

    public static Singleton3 getInstance() {
        if (instance == null) {
            synchronized (Singleton3.class) {
                if (instance == null) {
                    instance = new Singleton3();
                }
            }
        }
        return instance;
    }

}
