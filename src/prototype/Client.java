package prototype;

import org.junit.jupiter.api.Test;

/**
 * @Author Xyz
 * @Date 2022/1/19
 */
public class Client {

    @Test
    public void test1() throws CloneNotSupportedException {
        PrototypeA source = new PrototypeA("xyz", 25);
        System.out.println(source);

        PrototypeA newInstanceA = source.clone();
        System.out.println(newInstanceA);

    }
}
