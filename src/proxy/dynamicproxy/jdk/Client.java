package proxy.dynamicproxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;


/**
 * @Author Xyz
 * @Date 2022/1/24
 */
public class Client {
    public static void main(String[] args) {
        Room host = new Host();
        InvocationHandler proxyHandler = new ProxyHandler(host);

        Room agent = (Room) Proxy.newProxyInstance(host.getClass().getClassLoader(), host.getClass().getInterfaces(), proxyHandler);
        agent.rent();
        agent.sell();
    }
}
