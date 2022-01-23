package proxy.demo;

/**
 * @Author Xyz
 * @Date 2022/1/24
 */
public class Client {
    public static void main(String[] args) {
        RealObject proxy = new Proxy();
        proxy.doSomething();
    }
}
