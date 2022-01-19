package adapter;

import org.junit.jupiter.api.Test;

/**
 * @Author Xyz
 * @Date 2022/1/19
 */
public class Client {

    @Test
    public void test() {
        LogFactory logFactory = new LogAdapter(new ThirdLoggerImpl());
        logFactory.debug("debug", "haha ni hao");
    }
}
