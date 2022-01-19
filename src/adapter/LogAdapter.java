package adapter;

import java.util.Objects;

/**
 * @Author Xyz
 * @Date 2022/1/19
 */
public class LogAdapter implements LogFactory{

    // 聚合第三方日志类
    private ThirdLogger thirdLogger;

    public LogAdapter(ThirdLogger thirdLogger) {
        this.thirdLogger = thirdLogger;
    }

    @Override
    public void debug(String tag, String message) {
        Objects.requireNonNull(thirdLogger);
        thirdLogger.debug(1, message);
    }
}
