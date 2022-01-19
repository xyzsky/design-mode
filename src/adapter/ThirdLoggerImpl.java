package adapter;

/**
 * @Author Xyz
 * @Date 2022/1/19
 */
public class ThirdLoggerImpl implements ThirdLogger{
    @Override
    public void debug(int priority, String message, Object... objects) {
        System.out.println("第三方日志系统: " + message);
    }
}
