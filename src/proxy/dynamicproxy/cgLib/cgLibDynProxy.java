package proxy.dynamicproxy.cgLib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Author Xyz
 * @Date 2022/1/24
 */
public class cgLibDynProxy implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        if (method.getName().equals("rent"))
            System.out.println("中介代理房东出租房屋");
        Object result = methodProxy.invokeSuper(o, objects);
        return result;
    }
}
