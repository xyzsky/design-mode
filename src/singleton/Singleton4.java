package singleton;

/**
 * @Author Xyz
 * @Date 2022/1/15
 */

//第一次加载Singleton类时并不会初始化sInstance，只有第一次调用getInstance方法时虚拟机加载SingletonInner 并初始化instance
public class Singleton4 {

    private Singleton4() {

    }

    public static Singleton4 getInstance() {
        return SingletonInner.instance;
    }

    private static class SingletonInner {
        private static final Singleton4 instance = new Singleton4();
    }
}
