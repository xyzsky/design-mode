package simple_factory;

import org.junit.jupiter.api.Test;

/**
 * @Author Xyz
 * @Date 2022/1/18
 */
public class Client {

    @Test
    public void test() {
        // 简单工厂模式，通过静态方法返回创建好的实例；缺点是违反了开闭原则，当需要添加一个新的产品
        // 如 huawei 时， 需要进行修改原代码
        SimpleFactory.makeComputer("apple").setCpu();
    }
}
