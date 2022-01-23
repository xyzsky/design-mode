package proxy.demo;

/**
 * @Author Xyz
 * @Date 2022/1/24
 */
public class Proxy extends RealObjectImpl{
    @Override
    public void doSomething() {
        System.out.println("代理类执行真实对象");
        super.doSomething();
    }
}
