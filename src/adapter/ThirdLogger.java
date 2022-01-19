package adapter;

/**
 * 第三方接口，需要适配类
 */
public interface ThirdLogger {
    void debug(int priority, String message, Object ...objects );
}
