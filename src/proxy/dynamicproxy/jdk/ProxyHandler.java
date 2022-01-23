package proxy.dynamicproxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author Xyz
 * @Date 2022/1/24
 */
public class ProxyHandler implements InvocationHandler {

    private Object object;

    public ProxyHandler(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("--------jdk 动态代理前-------------");
        System.out.println(proxy.getClass().getName());
        System.out.println("--------执行"+ method.getName() + "------------");
        Object result = method.invoke(object, args);
        System.out.println("--------jdk 动态代理后-------------");
        return result;
    }
}
